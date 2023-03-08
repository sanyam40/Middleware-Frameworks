package com.Spring.Jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Spring.entity.Admin;

public class AdminRowMapper implements RowMapper<Admin>{

	@Override
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setUsername(rs.getString("username"));
		admin.setPassword(rs.getString("password"));
		return admin;
	}

}
