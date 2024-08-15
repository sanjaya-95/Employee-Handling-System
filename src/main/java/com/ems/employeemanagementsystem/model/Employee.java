package com.ems.employeemanagementsystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;


}


    /*List Employees
    Add Employee
    Update Employee
    Delete Employee
    Pagination
            Sorting*/