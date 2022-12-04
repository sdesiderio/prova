package com.enway.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enway.entity.Employee;
import com.enway.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveOrUpdateEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public Map<String, Boolean> removeEmployee(String passportNumber) {

		Map<String, Boolean> map = new HashMap<>();

		if (employeeRepository.existsById(passportNumber)) {

			employeeRepository.deleteById(passportNumber);

			if (!employeeRepository.existsById(passportNumber)) {

				map.put("deleted", true);

			}

			else {

				map.put("deleted", false);

			}

		}

		else {

			map.put("deleted", false);

		}

		return map;
	}

	@Override
	public Employee findEmployeeByPassportNumber(String passportNumber) {

		return employeeRepository.findById(passportNumber).get();
	}

	@Override
	public List<Employee> findAllEmployees() {

		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findAllEmployeesByWorkingRole(String workingRole) {

		return employeeRepository.findByWorkingRole(workingRole);
	}

	@Override
	public List<Employee> findAllEmployeesByExperienceYears(int experienceYears) {

		return employeeRepository.findByExperienceYears(experienceYears);
	}

}
