package com.empmgtsys.employeemanagement.service;


import com.empmgtsys.employeemanagement.DTO.DepartmentRequest;
import com.empmgtsys.employeemanagement.DTO.DepartmentResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {

    DepartmentResponse createDepartment(DepartmentRequest request);

    DepartmentResponse getDepartmentById(Integer id);

    List<DepartmentResponse> getAllDepartment();

    DepartmentResponse updateDepartment(Integer id, DepartmentRequest request);

    void deleteDepartment(Integer id);

    void deleteAllDepartment();


}
