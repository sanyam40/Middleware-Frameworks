package com.Spring.JDBCTemplate.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Spring.JDBCTemplate.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertEmployee(Employee emp) {
		String query="insert into employee values(?,?,?,?)";
		Object[] arr= {emp.getEmp_id(),emp.getEmp_name(),emp.getEmp_salary(),emp.getEmp_address()};
		int result=jdbcTemplate.update(query,arr);
		return result;
	}

	@Override
	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployee(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeRecords() {
		// TODO Auto-generated method stub
		return null;
	}

}
