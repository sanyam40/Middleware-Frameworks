/* SANYAM 21CSU234
 * --> JAVA BASED CONFIGURATION FOR JDBC TEMPLATE
 * */

package com.Spring.Jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://LocalHost:3306/springmvc");
		ds.setUsername("root");
		ds.setPassword("0721");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean(name={"studentdao"})
	public StudentDaoImpl getDao() {
		StudentDaoImpl dao=new StudentDaoImpl();
		dao.setJdbcTemplate(getTemplate());
		return dao;
	}

}
