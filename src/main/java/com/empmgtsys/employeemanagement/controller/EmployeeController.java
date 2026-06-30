package com.empmgtsys.employeemanagement.controller;


import com.empmgtsys.employeemanagement.DTO.EmployeeRequest;
import com.empmgtsys.employeemanagement.DTO.EmployeeResponse;
import com.empmgtsys.employeemanagement.Repository.EmployeeRepository;
import com.empmgtsys.employeemanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;


    public EmployeeController(EmployeeRepository employeeRepository, EmployeeService employeeService) {
        this.employeeService = employeeService;

    }


    @PostMapping("/create")
    public EmployeeResponse creteEmp(@RequestBody EmployeeRequest emp){
        return employeeService.createEmployee(emp);
    }

    @GetMapping("/all")
    public List<EmployeeResponse> getAllEmp(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public EmployeeResponse getEmptById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/dept/{dept}")
    public List<EmployeeResponse> getEmpByDept(@PathVariable String dept){
        return employeeService.getEmployeeByDept(dept);
    }
    @GetMapping("/email/{email}")
    public EmployeeResponse getEmpByEmail(@PathVariable String emial){
        return employeeService.getEmployeeByEmail(emial);
    }

    @GetMapping("/id/{id}")
    public EmployeeResponse getEmpByRole(@PathVariable Integer id){
        return employeeService.getEmployeeByRole(id);
    }

    @PutMapping("/{id}")
    public EmployeeResponse updateEmp(@PathVariable Integer id, EmployeeRequest employeeRequest){
        return employeeService.updateEmployee(id,employeeRequest);
    }
}
