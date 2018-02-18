package com.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	

}
