package com.empmgtsys.employeemanagement.controller;


import com.empmgtsys.employeemanagement.DTO.DepartmentRequest;
import com.empmgtsys.employeemanagement.DTO.DepartmentResponse;
import com.empmgtsys.employeemanagement.service.DepartmentService;
import com.empmgtsys.employeemanagement.service.implementation.DepartmentServiceImplementation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService service;

    public DepartmentController(DepartmentServiceImplementation service) {
        this.service = service;
    }

    @PostMapping("/create")
    public DepartmentResponse createDepartment(@RequestBody DepartmentRequest request){
        return service.createDepartment(request);
    }

    @GetMapping("/all")
    public List<DepartmentResponse> getAllDepartment(){
        return service.getAllDepartment();
    }

    @GetMapping("/{id}")
    public DepartmentResponse getDepartment(@PathVariable Integer id){
        return service.getDepartmentById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteDepartmentById(@PathVariable Integer id){
        service.deleteDepartment(id);
        return  "Record Deleted Successfully...!";
    }

    @PutMapping("/{id}")
    public DepartmentResponse updateDepartmentById(@PathVariable Integer Id,@RequestBody DepartmentRequest request){
        return service.updateDepartment(Id,request);
    }

}
