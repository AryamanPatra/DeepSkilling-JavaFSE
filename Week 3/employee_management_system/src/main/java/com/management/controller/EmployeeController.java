package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.model.Employee;
import com.management.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @SuppressWarnings("rawtypes")
    @PostMapping(value="/employee")
    public ResponseEntity saveEmployeeData(@RequestBody Employee employee){
        try {
            employeeService.saveEmployee(employee);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @GetMapping(value="/employees")
    public ResponseEntity<List<Employee>> getAllEmployeeData(){
        try {
            return new ResponseEntity<>(employeeService.getAllEmployees(),HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @SuppressWarnings("rawtypes")
    @PutMapping(value="/employee")
    public ResponseEntity updateEmployeeData(@RequestBody Employee employee){
        try {
            employeeService.updateEmployee(employee);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @SuppressWarnings("rawtypes")
    @DeleteMapping(value = "/employee")
    public ResponseEntity deleteEmployeeData(@RequestParam(value="id") Long id){
        try {
            employeeService.deleteEmployee(id);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }
    
}
