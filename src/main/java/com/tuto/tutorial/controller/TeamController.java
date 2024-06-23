package com.tuto.tutorial.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tuto.tutorial.entity.Player;
import com.tuto.tutorial.entity.Team;
import com.tuto.tutorial.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/teams")
@AllArgsConstructor
public class TeamController {
    private TeamService teamService;

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public Team createTeam(@RequestBody Team team) {
        this.teamService.createTeam(team);
        return team;
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "/{id}")
    public Team getTeam(@PathVariable("id") int id) {
        return this.teamService.getTeam(id);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping
    public List<Team> getTeams(@RequestParam(required = false) String country) {
        return this.teamService.getTeams(country);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @PatchMapping(path = "/{id}", consumes = "application/json-patch+json")
    public Team updateTeam(@PathVariable("id") int id, @RequestBody JsonPatch json) throws JsonPatchException, JsonProcessingException {
        return this.teamService.updateTeam(id, json);
    }

    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @DeleteMapping(path = "/{id}")
    public void deleteTeam(@PathVariable("id") int id) {
        this.teamService.deleteTeam(id);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "/{id}/players")
    public List<Player> getPlayers(@PathVariable("id") int id) {
        return this.teamService.getPlayers(id);
    }

}
