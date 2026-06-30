package com.empmgtsys.employeemanagement.service;

import com.empmgtsys.employeemanagement.DTO.RoleRequest;
import com.empmgtsys.employeemanagement.DTO.RoleResponse;

import java.util.List;

public interface RoleService {

    RoleResponse createRole(RoleRequest request);

    RoleResponse getRoleById(Integer id);

    List<RoleResponse> getAllRole();

    RoleResponse updateRole(
            Integer id,
            RoleRequest request);

    void deleteRole(Integer id);
}