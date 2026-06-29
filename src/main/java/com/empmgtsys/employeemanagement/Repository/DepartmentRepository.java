package com.empmgtsys.employeemanagement.Repository;

import com.empmgtsys.employeemanagement.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
