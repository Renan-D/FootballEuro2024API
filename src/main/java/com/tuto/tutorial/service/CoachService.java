package com.tuto.tutorial.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tuto.tutorial.repository.CoachRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CoachService {
    private final CoachRepository coachRepository;
    private ObjectMapper objectMapper;

}
