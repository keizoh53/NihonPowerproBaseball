package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class FielderAbility {
    private Integer angle;
    private Integer meet;
    private Integer power;
    private Integer run;
    private Integer shoulder;
    private Integer defence;
    private Integer catching;
    private List<Map<String, Integer>> fieldSkill;
}
