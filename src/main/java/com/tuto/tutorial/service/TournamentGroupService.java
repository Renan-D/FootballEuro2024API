package com.tuto.tutorial.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tuto.tutorial.repository.TournamentGroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TournamentGroupService {
    private final TournamentGroupRepository tournamentGroupRepository;
    private ObjectMapper objectMapper;

}
