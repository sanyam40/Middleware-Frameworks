package com.Spring.JDBCTemplate.Dao;

import java.util.List;

import com.Spring.JDBCTemplate.entity.Employee;

public interface EmployeeDao {
	
	public int insertEmployee(Employee emp);
	public int deleteEmployee(String empId);
	public int updateEmployee(Employee emp);
	public Employee getEmployee(int id);
	public List<Employee> getEmployeeRecords();

}
