package com.empmgtsys.employeemanagement.service;

import com.empmgtsys.employeemanagement.DTO.EmployeeRequest;
import com.empmgtsys.employeemanagement.DTO.EmployeeResponse;

import java.util.List;

public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);
    String delEmployee(Integer id);
    List<EmployeeResponse> getAllEmployee();
    EmployeeResponse updateEmployee( Integer id,EmployeeRequest employeeRequest);
    EmployeeResponse getEmployeeById(Integer id);
    List<EmployeeResponse> getEmployeeByDept(String dept);
    EmployeeResponse getEmployeeByEmail(String email);
    List<EmployeeResponse> getEmployeeByRole(Integer role);


}
