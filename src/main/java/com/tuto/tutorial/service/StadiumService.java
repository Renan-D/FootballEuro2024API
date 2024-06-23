package com.tuto.tutorial.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tuto.tutorial.repository.StadiumRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StadiumService {
    private final StadiumRepository stadiumRepository;
    private ObjectMapper objectMapper;

}
