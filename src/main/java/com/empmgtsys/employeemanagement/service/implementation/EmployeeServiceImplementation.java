package com.empmgtsys.employeemanagement.service.implementation;

import com.empmgtsys.employeemanagement.DTO.EmployeeRequest;
import com.empmgtsys.employeemanagement.DTO.EmployeeResponse;
import com.empmgtsys.employeemanagement.Entity.Department;
import com.empmgtsys.employeemanagement.Entity.Employee;
import com.empmgtsys.employeemanagement.Entity.Role;
import com.empmgtsys.employeemanagement.Repository.DepartmentRepository;
import com.empmgtsys.employeemanagement.Repository.EmployeeRepository;
import com.empmgtsys.employeemanagement.Repository.RoleRepository;
import com.empmgtsys.employeemanagement.service.EmployeeService;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImplementation implements EmployeeService {


    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final RoleRepository roleRepository;


    public EmployeeServiceImplementation(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository, RoleRepository roleRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest emp){
        Employee employee = new Employee();
        employee.setName(emp.getName());
        employee.setEmail(emp.getEmail());
        employee.setPassword(emp.getPassword());
        employee.setPhone(emp.getPhone());
        employee.setSalary(emp.getSalary());
        employee.setJoiningDate(emp.getJoiningDate());
        Department dept = departmentRepository.findById(emp.getDepartmentId()).orElseThrow();
        employee.setDepartment(dept);
        Role role = roleRepository.findById(emp.getRoleId()).orElseThrow();
        employee.setRole(role);
        Employee saved = employeeRepository.save(employee);

        return new EmployeeResponse(
                saved.getId(),
                saved.getName(),
                saved.getEmail(),
                saved.getPhone(),
                saved.getSalary(),
                saved.getJoiningDate(),
                saved.getDepartment().getName(),
                saved.getRole().getName()
        );

    }

    @Override
    public String delEmployee(Integer id) {
        employeeRepository.deleteById(id);
        return "Deleted Record of Employee";
    }

    @Override
    public List<EmployeeResponse> getAllEmployee() {
        List<Employee> emp = employeeRepository.findAll();
        List<EmployeeResponse> empRes= new ArrayList<>();

        for(Employee e: emp){
            empRes.add(new EmployeeResponse(
                    e.getId(),
                    e.getName(),
                    e.getEmail(),
                    e.getPhone(),
                    e.getSalary(),
                    e.getJoiningDate(),
                    e.getDepartment().getName(),
                    e.getRole().getName()
            ));
        }
        return empRes;


    }

    @Override
    public EmployeeResponse updateEmployee(
            Integer id,
            EmployeeRequest employeeRequest) {

        Employee emp = employeeRepository.findById(id).orElseThrow();

        emp.setName(employeeRequest.getName());
        emp.setEmail(employeeRequest.getEmail());
        emp.setPassword(employeeRequest.getPassword());
        emp.setPhone(employeeRequest.getPhone());
        emp.setSalary(employeeRequest.getSalary());
        emp.setJoiningDate(employeeRequest.getJoiningDate());

        Department department = departmentRepository.findById(
                employeeRequest.getDepartmentId()).orElseThrow();

        Role role = roleRepository.findById(employeeRequest.getRoleId())
                        .orElseThrow();

        emp.setDepartment(department);
        emp.setRole(role);

        Employee updated =
                employeeRepository.save(emp);

        return new EmployeeResponse(
                updated.getId(),
                updated.getName(),
                updated.getEmail(),
                updated.getPhone(),
                updated.getSalary(),
                updated.getJoiningDate(),
                updated.getDepartment().getName(),
                updated.getRole().getName()
        );
    }

    @Override
    public EmployeeResponse getEmployeeById(Integer id) {
        Employee saved = employeeRepository.findById(id).orElseThrow();

        return new EmployeeResponse(
                saved.getId(),
                saved.getName(),
                saved.getEmail(),
                saved.getPhone(),
                saved.getSalary(),
                saved.getJoiningDate(),
                saved.getDepartment().getName(),
                saved.getRole().getName()
        );
    }

    @Override
    public List<EmployeeResponse> getEmployeeByDept(String dept) {
        List<Employee> emp = employeeRepository.findAll();
        List<EmployeeResponse> empRes= new ArrayList<>();

        for(Employee e: emp){
            if(e.getDepartment().getName().equals(dept)) {
                empRes.add(new EmployeeResponse(
                        e.getId(),
                        e.getName(),
                        e.getEmail(),
                        e.getPhone(),
                        e.getSalary(),
                        e.getJoiningDate(),
                        e.getDepartment().getName(),
                        e.getRole().getName()
                ));
            }
        }
        return empRes;
    }

    @Override
    public EmployeeResponse getEmployeeByEmail(String email) {
        List<Employee> emp = employeeRepository.findAll();

        for(Employee e: emp){
            if(e.getEmail().equals(email)) {
                return (new EmployeeResponse(
                        e.getId(),
                        e.getName(),
                        e.getEmail(),
                        e.getPhone(),
                        e.getSalary(),
                        e.getJoiningDate(),
                        e.getDepartment().getName(),
                        e.getRole().getName()
                ));
            }
        }
        return (new EmployeeResponse(


        ));
    }


    @Override
    public EmployeeResponse getEmployeeByRole(Integer role) {
        List<Employee> emp = employeeRepository.findAll();

        for(Employee e: emp){
            if((e.getRole().getId()).equals(role)) {
                return (new EmployeeResponse(
                        e.getId(),
                        e.getName(),
                        e.getEmail(),
                        e.getPhone(),
                        e.getSalary(),
                        e.getJoiningDate(),
                        e.getDepartment().getName(),
                        e.getRole().getName()
                ));
            }
        }
        return new EmployeeResponse();
    }
    }
