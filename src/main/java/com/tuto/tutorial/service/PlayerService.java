package com.tuto.tutorial.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tuto.tutorial.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;
    private ObjectMapper objectMapper;

}
