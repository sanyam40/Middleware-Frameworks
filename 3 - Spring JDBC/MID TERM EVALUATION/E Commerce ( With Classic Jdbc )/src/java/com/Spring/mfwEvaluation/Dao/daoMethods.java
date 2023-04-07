package com.Spring.mfwEvaluation.Dao;

import java.sql.SQLException;
import java.util.List;

import com.Spring.mfwEvaluation.entity.user;
import com.Spring.mfwEvaluation.entity.product;

public interface daoMethods {
	
	public List<user> loginCheck(String username,String password) throws ClassNotFoundException, SQLException;
	
	public void add_product(product product) throws ClassNotFoundException, SQLException;

	public void add_user(user user) throws ClassNotFoundException, SQLException;
	
	public List<product>getCartItems(List<String>nameList) throws ClassNotFoundException, SQLException;
	
	public List<product> display() throws ClassNotFoundException, SQLException;
}
