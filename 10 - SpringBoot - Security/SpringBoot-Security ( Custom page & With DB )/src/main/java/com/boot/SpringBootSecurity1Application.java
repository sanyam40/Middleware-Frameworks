package com.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.boot.dao.UserRepo;
import com.boot.entity.User;

@SpringBootApplication
public class SpringBootSecurity1Application implements CommandLineRunner{
	
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurity1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user1=new User("sanyam",this.passwordEncoder.encode("sanyam"),"sanyam@gmail.com","ROLE_NORMAL");
		User user2=new User("admin",this.passwordEncoder.encode("admin"),"admin@gmail.com","ROLE_ADMIN");
		
		this.userRepo.save(user1);
		this.userRepo.save(user2);
		
	}
	
	

}
