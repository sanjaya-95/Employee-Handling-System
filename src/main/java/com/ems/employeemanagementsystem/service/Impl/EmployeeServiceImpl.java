package com.ems.employeemanagementsystem.service.Impl;

import com.ems.employeemanagementsystem.dto.EmployeeDto;
import com.ems.employeemanagementsystem.model.Employee;
import com.ems.employeemanagementsystem.repo.EmployeeRepo;
import com.ems.employeemanagementsystem.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;
    private ModelMapper modelMapper;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo, ModelMapper modelMapper) {
        this.employeeRepo = employeeRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = employeeRepo.findAll();
        return employeeList;
    }

    @Override
    public String saveEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "Employee Saved";
    }

    @Override
    public String deleteEmployeeById(long id) {
        employeeRepo.deleteById(id);
        return null;
    }
}
