package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class PitcherAbility {
    private Integer speed;
    private Integer control;
    private Integer stamina;
    private List<Map<String, Integer>> breakingBalls;
    private List<Map<String, Integer>> pitchingSkill;
}
