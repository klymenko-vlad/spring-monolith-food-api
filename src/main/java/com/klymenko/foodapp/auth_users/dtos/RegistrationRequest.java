package com.klymenko.foodapp.auth_users.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.util.List;

@Data
public class RegistrationRequest {
    @NotBlank(message = "Name must not be blank.")
    private String name;
    @NotBlank(message = "Email must not be blank.")
    private String email;

    @Size(min = 3, message = "Password must be at least 3 characters long.")
    @NotBlank(message = "Password must not be blank.")
    private String password;
    @NotBlank(message = "Address must not be blank.")
    private String address;
    @NotBlank(message = "Phone number must not be blank.")
    private String phoneNumber;

    private List<String> roles;
}
