package com.empmgtsys.employeemanagement.DTO;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DepartmentRequest {
    @NotBlank(message = "Department name is Required")
    private String name;
    @NotBlank(message = "Location name is Required")
    private String location;


}
