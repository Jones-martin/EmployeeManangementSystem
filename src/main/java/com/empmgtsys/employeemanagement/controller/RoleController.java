package com.empmgtsys.employeemanagement.controller;

import com.empmgtsys.employeemanagement.DTO.RoleRequest;
import com.empmgtsys.employeemanagement.DTO.RoleResponse;
import com.empmgtsys.employeemanagement.service.implementation.RoleServiceImplementation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    private final RoleServiceImplementation service;

    public RoleController(
            RoleServiceImplementation service) {
        this.service = service;
    }

    @PostMapping("/create")
    public RoleResponse createRole(
            @RequestBody RoleRequest request) {

        return service.createRole(request);
    }

    @GetMapping("/all")
    public List<RoleResponse> getAllRole() {
        return service.getAllRole();
    }

    @GetMapping("/{id}")
    public RoleResponse getRole(
            @PathVariable Integer id) {

        return service.getRoleById(id);
    }

    @PutMapping("/{id}")
    public RoleResponse updateRole(
            @PathVariable Integer id,
            @RequestBody RoleRequest request) {

        return service.updateRole(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteRole(
            @PathVariable Integer id) {

        service.deleteRole(id);
        return "Role Deleted Successfully";
    }
}