package com.enway.service;

import java.util.List;
import java.util.Map;

import com.enway.entity.Employee;

public interface EmployeeService {
	
	
	public Employee saveOrUpdateEmployee(Employee employee);
	
	public Map<String,Boolean> removeEmployee(String passportNumber);
	
	public Employee findEmployeeByPassportNumber(String passportNumber);
	
	public List<Employee> findAllEmployees();
	
	public List<Employee> findAllEmployeesByWorkingRole(String workingRole);
	
	public List<Employee> findAllEmployeesByExperienceYears(int experienceYears);
	
	

}
