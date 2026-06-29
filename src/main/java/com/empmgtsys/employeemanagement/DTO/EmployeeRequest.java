package com.empmgtsys.employeemanagement.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {

        private String name;
        private String email;
        private String password;
        private String phone;
        private BigDecimal salary;
        private LocalDate joiningDate;
        private Integer departmentId;
        private Integer roleId;
    }

