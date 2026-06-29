package com.empmgtsys.employeemanagement.Repository;

import com.empmgtsys.employeemanagement.Entity.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer> {
}
