package com.tuto.tutorial.entity;

import com.tuto.tutorial.entity.Enum.Position;
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
public class Player {
    @Id
    private Integer id;
    private String name;
    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDate birthDate;
    @Enumerated(EnumType.STRING)
    private Position position;

    @ManyToOne
    private Team team;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
    private List<Event> events;
}
