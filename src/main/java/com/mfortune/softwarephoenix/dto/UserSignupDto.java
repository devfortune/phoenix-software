package com.mfortune.softwarephoenix.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserSignupDto {

    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Surname cannot be blank")
    private String surname;
    @NotBlank(message = "Patronymic cannot be blank")
    private String patronymic;
    @NotBlank(message = "Username cannot be blank")
    private String username;
    @NotBlank(message = "Password cannot be blank")
    @Size(min = 6, max = 20, message = "Password must be between 6 and 20 characters")
    private String password;
    @NotBlank(message = "Confirm password cannot be blank")
    private String confirmPassword;
    private String imageUrl;

}
