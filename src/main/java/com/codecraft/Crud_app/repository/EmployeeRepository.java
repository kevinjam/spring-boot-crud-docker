package com.codecraft.Crud_app.repository;

import com.codecraft.Crud_app.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}