package com.empmgtsys.employeemanagement.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class LoginResponse {
    private String token;
    private String role;
    private String name;
}
