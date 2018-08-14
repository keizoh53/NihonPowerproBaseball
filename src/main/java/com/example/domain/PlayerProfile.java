package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "player_profile")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerProfile {
    @Id
    @GeneratedValue
    private Integer playerId;
    @Column(nullable = false)
    private String height;
}
