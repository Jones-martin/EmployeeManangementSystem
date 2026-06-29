package com.empmgtsys.employeemanagement.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.lang.model.element.NestingKind;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RoleResponse {
    private Integer id;
    private String name;
}
