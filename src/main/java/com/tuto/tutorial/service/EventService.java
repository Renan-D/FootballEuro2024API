package com.tuto.tutorial.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tuto.tutorial.repository.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventService {
    private final EventRepository eventRepository;
    private ObjectMapper objectMapper;

}
