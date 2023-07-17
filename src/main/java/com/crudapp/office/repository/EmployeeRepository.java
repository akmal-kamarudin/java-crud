package com.crudapp.office.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crudapp.office.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  
}
