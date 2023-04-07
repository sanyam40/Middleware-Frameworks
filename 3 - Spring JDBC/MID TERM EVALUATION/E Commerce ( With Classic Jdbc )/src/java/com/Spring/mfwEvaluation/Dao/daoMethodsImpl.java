package com.Spring.mfwEvaluation.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Spring.mfwEvaluation.entity.user;
import com.Spring.mfwEvaluation.entity.product;

public class daoMethodsImpl implements daoMethods{

	@Override
	public List<user> loginCheck(String username, String password) throws ClassNotFoundException, SQLException {
		
		Connection con=jdbcConfig.getConnection();
		String query="select username,password from user_details where username=? and password=?";
		
		PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, username);
        pst.setString(2, password);
        
        List<user>list=new ArrayList<user>();
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()) {
        	user user=new user();
        	
        	String nameString=rs.getString("username");
        	String passString=rs.getString("password");
        	user.setUsername(nameString);
        	user.setPassword(passString);
        	list.add(user);
        }
		return list;
	}
	
	public void add_product(com.Spring.mfwEvaluation.entity.product product) throws ClassNotFoundException, SQLException {
		
		Connection con=jdbcConfig.getConnection();
		String query="insert into product(name,category,quantity,description,price) values(?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, product.getName());
        pst.setString(2, product.getCategory());
        pst.setString(3, product.getQuantity());
        pst.setString(4, product.getDescription());
        pst.setString(5, product.getPrice());
        
        pst.executeUpdate();
	}
	
	public void add_user(user user) throws ClassNotFoundException, SQLException {
		Connection con=jdbcConfig.getConnection();
		String query="insert into user_details(firstname,lastname,username,password,emailId,usertype) value(?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, user.getFirstname());
        pst.setString(2, user.getLastname());
        pst.setString(3, user.getUsername());
        pst.setString(4, user.getPassword());
        pst.setString(5, user.getEmailId());
        pst.setString(6, user.getUsertype());
        
        pst.executeUpdate();
	}
	
	public List<product> display() throws ClassNotFoundException, SQLException{
		Connection con=jdbcConfig.getConnection();
		List<product>list=new ArrayList<product>();
		String query="select * from product";
		PreparedStatement pst = con.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			product p=new product();
			String name=rs.getString("name");
			String category=rs.getString("category");
			String quantity=rs.getString("quantity");
			String description=rs.getString("description");
			String price=rs.getString("price");
			p.setName(name);
			p.setCategory(category);
			p.setQuantity(quantity);
			p.setDescription(description);
			p.setPrice(price);
			list.add(p);
		}
		return list;
	}
	
	public List<product>getCartItems(List<String>nameList) throws ClassNotFoundException, SQLException{
		Connection con=jdbcConfig.getConnection();
		List<product>list=new ArrayList<product>();
		
		for(String namelist:nameList) {
			
			String query="select name,category,quantity,description,price from product where name=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,namelist);
			
			System.out.println(namelist);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				product p=new product();
				
				String name=rs.getString("name");
				String category=rs.getString("category");
				String quantity=rs.getString("quantity");
				String description=rs.getString("description");
				String price=rs.getString("price");
				
				p.setName(name);
				p.setCategory(category);
				p.setQuantity(quantity);
				p.setDescription(description);
				p.setPrice(price);
				list.add(p);
			}
		}
		return list;	
	}
}
