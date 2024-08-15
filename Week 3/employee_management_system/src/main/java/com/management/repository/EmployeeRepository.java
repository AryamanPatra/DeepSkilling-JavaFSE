package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    // Employee findEmployeeById(Long id);

    // List<Employee> findEmployeesByDeptId(Long id);

    // List<Employee> findEmployeesByName(String name);

    // Employee findEmployeeByEmail(String email);
}
