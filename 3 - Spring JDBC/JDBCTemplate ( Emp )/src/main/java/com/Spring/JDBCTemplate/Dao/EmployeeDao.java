package com.Spring.JDBCTemplate.Dao;

import java.util.List;

import com.Spring.JDBCTemplate.entity.Employee;

public interface EmployeeDao {
	
	public int insertEmployee(Employee emp);
	public int deleteEmployee(int empId);
	public int updateEmployee(int empId);
	public Employee getEmployee(int id);
	public List<Employee> getEmployeeRecords();

}
