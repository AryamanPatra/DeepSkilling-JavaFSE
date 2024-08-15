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

import com.management.model.Department;
import com.management.service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @SuppressWarnings("rawtypes")
    @PostMapping(value = "/department")
    public ResponseEntity saveDepartmentData(@RequestBody Department Department) {
        try {
            departmentService.saveDepartment(Department);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @GetMapping(value = "/departments")
    public ResponseEntity<List<Department>> getAllDepartmentData() {
        try {
            return new ResponseEntity<>(departmentService.getAllDepartments(), HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @SuppressWarnings("rawtypes")
    @PutMapping(value = "/department")
    public ResponseEntity updateDepartmentData(@RequestBody Department Department) {
        try {
            departmentService.updateDepartment(Department);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @SuppressWarnings("rawtypes")
    @DeleteMapping(value = "/department")
    public ResponseEntity deleteDepartmentData(@RequestParam(value = "id") Long id) {
        try {
            departmentService.deleteDepartment(id);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }
}
