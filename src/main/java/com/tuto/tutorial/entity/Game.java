package com.tuto.tutorial.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Game {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(
            nullable = false
    )
    private LocalDateTime date;

    @ManyToOne
    private KnockoutStage knockoutStage;
    @ManyToOne
    private TournamentGroup tournamentGroup;
    @ManyToOne
    private Stadium stadium;
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    private List<Event> events;

    @ManyToMany
    @JoinTable(
            name = "game_referee",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "referee_id")
    )
    private List<Referee> referees;

    @Size(min = 2, max = 2)
    @ManyToMany
    @JoinTable(
            name = "game_team",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id")
    )
    @JsonManagedReference
    private List<Team> teams;
}
