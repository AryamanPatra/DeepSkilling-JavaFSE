package com.management.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.model.Department;
import com.management.model.Employee;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    Department findDepartmentById(Long id);

    Department findDepartmentByName(String name);

    Set<Employee> findEmployeesUnderDepartment(Long id);
}
