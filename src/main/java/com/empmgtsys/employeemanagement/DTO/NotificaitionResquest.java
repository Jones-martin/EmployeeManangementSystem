package com.empmgtsys.employeemanagement.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class NotificaitionResquest {
    private Integer employeeId;
    private String message;
}
