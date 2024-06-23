package com.tuto.tutorial.entity;

import com.tuto.tutorial.entity.Enum.StageName;
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
public class KnockoutStage {
    @Id
    @GeneratedValue
    private Integer id;
    @Enumerated(EnumType.STRING)
    private StageName stageName;

    @OneToMany(mappedBy = "knockoutStage", cascade = CascadeType.ALL)
    private List<Game> games;
}
