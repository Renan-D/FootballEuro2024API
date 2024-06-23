package com.tuto.tutorial.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentGroup {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "tournamentGroup", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Team> teams;
    @OneToMany(mappedBy = "tournamentGroup", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Game> games;
}
