package com.tuto.tutorial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Referee {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private LocalDate birthDate;

    @ManyToMany(mappedBy = "referees", cascade = CascadeType.ALL)
    private List<Game> games;
}
