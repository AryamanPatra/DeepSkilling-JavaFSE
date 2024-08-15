package com.management.service;

import java.util.List;

import com.management.model.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    List<Department> getAllDepartments();
    Department updateDepartment(Department department);
    void deleteDepartment(Long id);
}
