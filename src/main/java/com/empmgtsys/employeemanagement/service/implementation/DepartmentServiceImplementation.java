package com.empmgtsys.employeemanagement.service.implementation;

import com.empmgtsys.employeemanagement.DTO.DepartmentRequest;
import com.empmgtsys.employeemanagement.DTO.DepartmentResponse;
import com.empmgtsys.employeemanagement.Entity.Department;
import com.empmgtsys.employeemanagement.Repository.DepartmentRepository;
import com.empmgtsys.employeemanagement.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DepartmentServiceImplementation implements DepartmentService
{
    private final DepartmentRepository repository;

    public DepartmentServiceImplementation(DepartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public DepartmentResponse createDepartment(DepartmentRequest request) {
        Department dept= new Department();
        dept.setLocation(request.getLocation());
        dept.setName(request.getName());
        Department saved = repository.save(dept);

        return new DepartmentResponse(
                saved.getId(),
                saved.getName(),
                saved.getLocation()
        );
    }

    @Override
    public DepartmentResponse getDepartmentById(Integer id) {
        Department dept = repository.findById(id).orElse(null);
        assert dept != null;
        return new DepartmentResponse(dept.getId(),dept.getLocation(),dept.getName());
    }

    @Override
    public List<DepartmentResponse> getAllDepartment() {
        List<Department> dept = repository.findAll();
        List<DepartmentResponse> deptRes = new ArrayList<>();
        for(Department dp : dept){
            deptRes.add(new DepartmentResponse(
                    dp.getId(),
                    dp.getName(),
                    dp.getLocation()
            )
            );
        }
        return deptRes;
    }

    @Override
    public DepartmentResponse updateDepartment(Integer id, DepartmentRequest request) {

        Department dept = repository.findById(id).orElseThrow();
        dept.setName(request.getName());
        dept.setLocation(request.getLocation());
        Department update = repository.save(dept);
        return new DepartmentResponse(update.getId(),update.getName(),update.getLocation());
    }

    @Override
    public void deleteDepartment(Integer id) {
        Department dept = repository.findById(id).orElseThrow();
        repository.delete(dept);

    }

    @Override
    public void deleteAllDepartment() {
        repository.deleteAll();
    }


}
