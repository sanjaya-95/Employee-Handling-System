package com.ems.employeemanagementsystem.service;

import com.ems.employeemanagementsystem.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    String saveEmployee(Employee employee);

    String deleteEmployeeById(long id);

}
