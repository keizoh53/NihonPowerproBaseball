package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "players")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
//    public Player(Integer playerId, String firstName, String lastName) {
//        this.playerId = playerId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
    @Id
    @GeneratedValue
    private Integer playerId;
//    @Column(nullable = true)
//    private String firstName;
    @Column(nullable = true)
    private String lastName;
    @Column(nullable = false)
    private String team;
    @Column(nullable = false)
    private String mainPosition;
//    @Column(nullable = true)
//    private List<String> subPosition;
//    private Integer age;
//    private Integer years;
//    private String birthDay;
//    private Map<String, String> team;
//    private List<Map<String, String>> oldTeams;
//    private Integer uniformNumber;
//    private Boolean firstTeam;
//    private String mainPosition;
//    private List<String> subPositions;
//    private String throwing;
//    private String handed;
//    private Ability ability;
}
