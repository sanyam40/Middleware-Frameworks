package com.Spring.JDBCTemplate.Service;

import java.util.List;

import com.Spring.JDBCTemplate.entity.Employee;

public interface EmployeeService {
	
	public String createRecord(Employee emp);
	public int updateRecord(int empId);
	public int deleteRecord(int empId);
	public Employee fetchEmployee(int empId);
	public List<Employee> loadEmployees();

}
