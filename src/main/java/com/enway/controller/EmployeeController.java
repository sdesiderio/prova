package com.enway.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enway.entity.Employee;
import com.enway.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
	public Employee saveOrUpdateEmployee(@RequestBody Employee employee) {
		
		return employeeService.saveOrUpdateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{passportNumber}")
	public Map<String,Boolean> removeEmployee(@PathVariable String passportNumber) {
		
		return employeeService.removeEmployee(passportNumber);
	}
	
	@GetMapping("/employees/{passportNumber}")
	public Employee findEmployeeByPassportNumber(@PathVariable String passportNumber) {
		
		return employeeService.findEmployeeByPassportNumber(passportNumber);
	}
	
	@GetMapping("/employees")
	public List<Employee> findEmployees() {
		
		return employeeService.findAllEmployees();
	}
	
	@GetMapping("/employees/working-role/{workingRole}")
	public List<Employee> findAllEmployeesByWorkingRole(@PathVariable String workingRole) {
		
		return employeeService.findAllEmployeesByWorkingRole(workingRole);
	}
	
	@GetMapping("/employees/experience-years/{experienceYears}")
	public List<Employee> findAllEmployeesByExperienceYears(@PathVariable int experienceYears) {
		
		return employeeService.findAllEmployeesByExperienceYears(experienceYears);
	}
	

}
