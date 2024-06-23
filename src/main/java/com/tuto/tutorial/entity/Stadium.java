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
public class Stadium {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String city;
    private Integer capacity;
    @OneToMany(mappedBy = "stadium", cascade = CascadeType.ALL)
    private List<Game> games;
}
