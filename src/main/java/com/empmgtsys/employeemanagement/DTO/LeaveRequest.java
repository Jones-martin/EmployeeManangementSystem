package com.empmgtsys.employeemanagement.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class LeaveRequest {
    private Integer employeeId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
}
