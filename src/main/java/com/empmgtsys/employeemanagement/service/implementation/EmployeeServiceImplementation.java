package com.empmgtsys.employeemanagement.service.implementation;

import com.empmgtsys.employeemanagement.DTO.EmployeeRequest;
import com.empmgtsys.employeemanagement.DTO.EmployeeResponse;
import com.empmgtsys.employeemanagement.Entity.Employee;
import com.empmgtsys.employeemanagement.Repository.EmployeeRepository;
import com.empmgtsys.employeemanagement.service.EmployeeService;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImplementation implements EmployeeService {



    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest emp){
        Employee employee = new Employee();
        employee.setName(emp.getName());
        employee.setEmail(emp.getEmail());
        employee.setPassword(employee.getPassword());
        employee.setPhone(employee.getPhone());

        return null;

    }

    @Override
    public void delEmployee(Integer id) {

    }

    @Override
    public List<EmployeeResponse> getAllEmployee() {
        return List.of();
    }

    @Override
    public EmployeeResponse updateEmployee(Integer id, EmployeeRequest employeeRequest) {
        return null;
    }

    @Override
    public EmployeeResponse getEmployeeById(Integer id) {
        return null;
    }

    @Override
    public List<EmployeeResponse> getEmployeeByDept(String dept) {
        return List.of();
    }

    @Override
    public EmployeeResponse getEmployeeByEmail(String email) {
        return null;
    }

    @Override
    public List<EmployeeResponse> getEmployeeByRole(Integer role) {
        return List.of();
    }
}
