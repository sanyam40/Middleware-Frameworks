package com.Spring.JDBCTemplate.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.JDBCTemplate.Dao.EmployeeDao;
import com.Spring.JDBCTemplate.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public String createRecord(Employee emp) {
		// TODO Auto-generated method stub
		int result=employeeDao.insertEmployee(emp);
		if(result==0) {
			return "Error Saving Record";
		}
		else {
			return "Record Inserted Successfully";
		}
	}

	@Override
	public int updateRecord(Employee emp) {
		// TODO Auto-generated method stub
		int r=employeeDao.updateEmployee(emp);
		return r;
	}

	@Override
	public int deleteRecord(String empId) {
		// TODO Auto-generated method stub
		int r=employeeDao.deleteEmployee(empId);
		return r;
	}

	@Override
	public Employee fetchEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> loadEmployees() {
		// TODO Auto-generated method stub
		List<Employee>list=employeeDao.getEmployeeRecords();
		System.out.println(list+" AT SERVICE LAYER");
		return list;
	}

}
