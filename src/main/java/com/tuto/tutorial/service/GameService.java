package com.tuto.tutorial.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tuto.tutorial.repository.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GameService {
    private final GameRepository gameRepository;
    private ObjectMapper objectMapper;

}
