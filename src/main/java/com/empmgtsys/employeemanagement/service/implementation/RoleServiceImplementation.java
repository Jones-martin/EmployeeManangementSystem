package com.empmgtsys.employeemanagement.service.implementation;

import com.empmgtsys.employeemanagement.DTO.RoleRequest;
import com.empmgtsys.employeemanagement.DTO.RoleResponse;
import com.empmgtsys.employeemanagement.Entity.Role;
import com.empmgtsys.employeemanagement.Repository.RoleRepository;
import com.empmgtsys.employeemanagement.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImplementation
        implements RoleService {

    private final RoleRepository repository;

    public RoleServiceImplementation(
            RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public RoleResponse createRole(
            RoleRequest request) {

        Role role = new Role();

        role.setName(request.getName());

        Role saved =
                repository.save(role);

        return new RoleResponse(
                saved.getId(),
                saved.getName()
        );
    }

    @Override
    public RoleResponse getRoleById(
            Integer id) {

        Role role =
                repository.findById(id)
                        .orElseThrow();

        return new RoleResponse(
                role.getId(),
                role.getName()
        );
    }

    @Override
    public List<RoleResponse> getAllRole() {

        List<Role> roles =
                repository.findAll();

        List<RoleResponse> response =
                new ArrayList<>();

        for (Role role : roles) {
            response.add(
                    new RoleResponse(
                            role.getId(),
                            role.getName()
                    )
            );
        }

        return response;
    }

    @Override
    public RoleResponse updateRole(
            Integer id,
            RoleRequest request) {

        Role role =
                repository.findById(id)
                        .orElseThrow();

        role.setName(request.getName());

        Role updated =
                repository.save(role);

        return new RoleResponse(
                updated.getId(),
                updated.getName()
        );
    }

    @Override
    public void deleteRole(
            Integer id) {

        repository.deleteById(id);
    }
}