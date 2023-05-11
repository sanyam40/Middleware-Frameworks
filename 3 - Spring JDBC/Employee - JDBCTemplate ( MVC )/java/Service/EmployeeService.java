package com.Spring.JDBCTemplate.Service;

import java.util.List;

import com.Spring.JDBCTemplate.entity.Employee;

public interface EmployeeService {
	
	public String createRecord(Employee emp);
	public int updateRecord(Employee emp);
	public int deleteRecord(String empId);
	public Employee fetchEmployee(int empId);
	public List<Employee> loadEmployees();

}
