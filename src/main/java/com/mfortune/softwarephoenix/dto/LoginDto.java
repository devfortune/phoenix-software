package com.mfortune.softwarephoenix.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LoginDto {
    private String username;
    private String password;
}
