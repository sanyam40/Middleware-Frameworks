package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.entity.User;
import com.entity.product;

public interface DaoMethods {
	
	public List<User> login(String username,String password) throws SQLException, ClassNotFoundException;
	
	public void add_product(product product) throws ClassNotFoundException, SQLException ;
	
	public void add_user(User user) throws ClassNotFoundException, SQLException;
	
	public List<product> display() throws ClassNotFoundException, SQLException;
	
	public List<product>getCartItems(List<String>nameList) throws ClassNotFoundException, SQLException;
	
	}



