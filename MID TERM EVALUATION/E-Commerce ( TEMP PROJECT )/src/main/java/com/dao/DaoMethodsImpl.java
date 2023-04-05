package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.User;
import com.entity.product;

public class DaoMethodsImpl implements DaoMethods{
	
	public List<User> login(String username, String password) throws SQLException, ClassNotFoundException {
	
		Connection con=JdbcConfig.getConnection();
		String query="select username,password from user_details where username=? and password=?";
		
		PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();
        
        List<User>list=new ArrayList<User>();
        
        while(rs.next()) {
        	User s=new User();
        	String name=rs.getString("username");
            String passwordd=rs.getString("password");
            s.setUsername(name);
            s.setPassword(passwordd);
        	list.add(s);
        }
		return list;	
	}
	
	public void add_user(User user) throws ClassNotFoundException, SQLException {
		Connection con=JdbcConfig.getConnection();
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
	
	
	public void add_product(product product) throws ClassNotFoundException, SQLException {
		
		Connection con=JdbcConfig.getConnection();
		String query="insert into product(name,category,quantity,description,price) values(?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, product.getName());
        pst.setString(2, product.getCategory());
        pst.setString(3, product.getQuantity());
        pst.setString(4, product.getDescription());
        pst.setString(5, product.getPrice());
        
        pst.executeUpdate();
	}
	
	public List<product> display() throws ClassNotFoundException, SQLException{
		Connection con=JdbcConfig.getConnection();
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
		Connection con=JdbcConfig.getConnection();
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
