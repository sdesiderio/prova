package com.enway.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enway.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
	
	public List<Employee> findByWorkingRole(String workingRole);
	
	public List<Employee> findByExperienceYears(int experienceYears);

}
