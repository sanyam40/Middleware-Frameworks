package com.Spring.JDBCTemplate.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
	public int deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		String aString="delete from employee where emp_id=?";
		int r=jdbcTemplate.update(aString,empId);
		return r;
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String queryString="update employee set emp_name=?,emp_salary=?,emp_address=? where emp_id=?";
		Object[]argsObjects= {emp.getEmp_name(),emp.getEmp_salary(),emp.getEmp_address(),emp.getEmp_id()};
		int r=jdbcTemplate.update(queryString,argsObjects);
		return r;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeRecords() {
		// TODO Auto-generated method stub
		String queryString="select * from employee";
		
		List<Employee>list=new ArrayList<>();
		System.out.println(list+" AT DAO LAYER");
		list=jdbcTemplate.query(queryString, new BeanPropertyRowMapper<Employee>(Employee.class));
		return list;
	}
}
