package com.empmgtsys.employeemanagement.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DepartmentResponse {

    private Integer id;
    private String name;
    private String location;
}