package com.tuto.tutorial.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Coach {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String nationality;
    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDate birthDate;

    @OneToOne
    @JsonBackReference
    private Team team;
}
