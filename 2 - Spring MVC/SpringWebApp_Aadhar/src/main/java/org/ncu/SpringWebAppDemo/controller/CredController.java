package org.ncu.SpringWebAppDemo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ncu.SpringWebAppDemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CredController {
	
	
	/*public void Add(@ModelAttribute User user) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aadhardetails","root","0721");
        
        String username=user.getUsername();
        String password=user.getUserpassword();
        String gender=user.getGender();
        String state=user.getState();
        String aadharid=user.getAadharId();
        String address=user.getAddress();
        
        String q="insert into details(username,password,gender,state,aadharid,address) values(?,?,?,?,?,?)";
        PreparedStatement stmt=con.prepareStatement(q);
        stmt.setString(1, username);
        stmt.setString(2, password);
        stmt.setString(3, gender);
        stmt.setString(4, state);
        stmt.setString(5, aadharid);
        stmt.setString(6, address);
        
        stmt.executeUpdate();
		System.out.println(user);
	}
	
	@ModelAttribute("user")
	public List<User> loadUsers(@ModelAttribute User user) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aadhardetails","root","0721");
        
		String q="select * from details;";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(q);
        
        List<User> UserList = new ArrayList<User>();
           
        while(rs.next()) {
		user.setUsername(rs.getString("Username"));
		user.setUserpassword(rs.getString("password"));
		user.setGender(rs.getString("gender"));
		user.setState(rs.getString("state"));
		user.setAadharId(rs.getString("AadharId"));
		user.setAddress(rs.getString("address"));
		System.out.println(user);
        }
        System.out.println(UserList);
        return UserList;
	}*/
}
