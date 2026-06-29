package com.empmgtsys.employeemanagement.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponse {
    private String title;
    private String description;
    private LocalDate deadline;
    private Integer assignedToId;
    private Integer assignedById;
}
