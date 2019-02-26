package com.example.EmployeeTracker.repositories;

import com.example.EmployeeTracker.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {


}

