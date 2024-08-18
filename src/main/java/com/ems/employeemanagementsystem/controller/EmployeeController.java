package com.ems.employeemanagementsystem.controller;

import com.ems.employeemanagementsystem.dto.EmployeeDto;
import com.ems.employeemanagementsystem.model.Employee;
import com.ems.employeemanagementsystem.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
        List<Employee> viewAll = employeeService.getAllEmployees();
        return viewAll;
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return "saved";
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteEmployeeById(@PathVariable(value = "id") long id){
        employeeService.deleteEmployeeById(id);
        return "Employee Deleted";
    }

    @GetMapping("/getEmployeeById")
    public EmployeeDto getEmployeeById(@RequestParam(value = "id") long id){
        EmployeeDto viewEmployee = employeeService.getEmployeeById(id);
        return viewEmployee;
    }


}
