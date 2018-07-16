package com.example.web;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class PlayerForm {
//    @NotNull
//    @Size(min = 1, max = 127)
//    private String firstName;
    @NotNull
    @Size(min = 1, max = 127)
    private String lastName;
    @NotNull
    @Size(min = 1, max = 127)
    private String team;
    @NotNull
    @Size(min = 1, max = 127)
    private String mainPosition;
}
