package com.empmgtsys.employeemanagement.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class NotificationResponse {
    private Integer id;
    private String employeeName;
    private String message;
    private Boolean isRead;
    private LocalDateTime createdAt;
}
