package com.tuto.tutorial.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonManagedReference
    private TournamentGroup tournamentGroup;
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Player> players;
    @OneToOne(mappedBy = "team", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Coach coach;
    @ManyToMany(mappedBy = "teams", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Game> games;
}
