package com.empmgtsys.employeemanagement.Repository;

import com.empmgtsys.employeemanagement.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
