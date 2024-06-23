package com.tuto.tutorial.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tuto.tutorial.repository.KnockoutStageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KnockoutStageService {
    private final KnockoutStageRepository knockoutStageRepository;
    private ObjectMapper objectMapper;

}
