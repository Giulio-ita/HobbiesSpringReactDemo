package com.employee.managerBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @GetMapping("/Employees")
    public List<String> getEmployees() {
        // Restituisci una lista di dipendenti fittizia per il test
        return List.of("Employee 1", "Employee 2", "Employee 3");
    }
}