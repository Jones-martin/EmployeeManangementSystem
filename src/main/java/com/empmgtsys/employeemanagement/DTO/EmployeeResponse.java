package com.empmgtsys.employeemanagement.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private BigDecimal salary;
    private LocalDate joiningDate;
    private String departmentName;
    private String roleName;
}
