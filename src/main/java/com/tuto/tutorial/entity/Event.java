package com.tuto.tutorial.entity;

import com.tuto.tutorial.entity.Enum.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer minute;
    @Column(
            columnDefinition = "TEXT"
    )
    private String description;

    @Enumerated(EnumType.STRING)
    private EventType eventType;

    @ManyToOne
    private Game game;
    @ManyToOne
    private Player player;

    /* IF SUBSTITUTION */
    @ManyToOne
    @JoinColumn(name = "substitute_in_id")
    private Player substituteIn;

    @ManyToOne
    @JoinColumn(name = "substitute_out_id")
    private Player substituteOut;
    /* IF SUBSTITUTION */

}
