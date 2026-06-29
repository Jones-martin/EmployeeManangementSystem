package com.empmgtsys.employeemanagement.Entity;


import com.empmgtsys.employeemanagement.Enums.LeaveStatus;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
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
@Table(name = "leave_requests")
public class LeaveRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    @Enumerated(EnumType.STRING)
    private LeaveStatus status;
}
