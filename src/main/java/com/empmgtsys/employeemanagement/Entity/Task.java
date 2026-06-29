package com.empmgtsys.employeemanagement.Entity;


import com.empmgtsys.employeemanagement.Enums.TaskStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private TaskStatus status;
    private LocalDate deadline;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private Employee assignedTo;

    @ManyToOne
    @JoinColumn(name = "assigned_by")
    private Employee assignedBy;

}
