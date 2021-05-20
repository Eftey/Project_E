package com.example.demo.dao;

import com.example.demo.enteties.EmployeePk;
import com.example.demo.enteties.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, EmployeePk> {
}
