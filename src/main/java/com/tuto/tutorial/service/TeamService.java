package com.tuto.tutorial.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import com.tuto.tutorial.entity.Player;
import com.tuto.tutorial.entity.Team;
import com.tuto.tutorial.repository.TeamRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository teamRepository;
    private ObjectMapper objectMapper;

    public void createTeam(Team team) {
        this.teamRepository.save(team);
    }

    public Team getTeam(int id) {
        return this.teamRepository.findById(id).orElse(null);
    }

    public List<Team> getTeams(String country) {
        System.out.println("country: " + country);
        if (country == null) {
            return this.teamRepository.findAll();
        }
        return this.teamRepository.findByCountry(country);
    }

    @Transactional
    public Team updateTeam(int id, JsonPatch json) throws JsonPatchException, JsonProcessingException {
        Team team = this.teamRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Team not found"));

        JsonNode patched = json.apply(objectMapper.convertValue(team, JsonNode.class));
        Team updatedTeam = objectMapper.treeToValue(patched, Team.class);
        this.teamRepository.save(updatedTeam);
        return updatedTeam;
    }

    public void deleteTeam(int id) {
        this.teamRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Team not found"));
        this.teamRepository.deleteById(id);
    }

    public List<Player> getPlayers(int id) {
        Team team = this.teamRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Team not found"));
        return team.getPlayers();
    }

}
