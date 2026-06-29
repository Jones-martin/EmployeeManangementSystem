package com.empmgtsys.employeemanagement.DTO;

import com.empmgtsys.employeemanagement.Enums.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TaskRequest {
    private Integer id;
    private String title;
    private String description;
    private TaskStatus status;
    private LocalDate deadline;
    private String assignedTo;
    private String assignedBy;
}

