package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ability {
    private PitcherAbility pitcherAbility;
    private FielderAbility fielderAbility;
}
