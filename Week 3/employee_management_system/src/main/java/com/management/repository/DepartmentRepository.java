package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    Department findDepartmentById(Long id);

    Department findDepartmentByName(String name);
}
