package com.tuto.tutorial.entity;

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
public class Team {
    @Id
    @GeneratedValue
    private Integer id;
    private String country;
    @ManyToOne
    private TournamentGroup tournamentGroup;
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players;
    @OneToOne(mappedBy = "team", cascade = CascadeType.ALL)
    private Coach coach;
    @ManyToMany(mappedBy = "teams", cascade = CascadeType.ALL)
    private List<Game> games;
}
