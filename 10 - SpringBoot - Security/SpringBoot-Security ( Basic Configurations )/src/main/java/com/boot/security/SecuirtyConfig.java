package com.boot.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecuirtyConfig{
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails normal=User.withUsername("sanyam")
				.password(passwordEncoder().encode("sanyam")).roles("NORMAL").build();
		
		UserDetails admin=User.withUsername("admin")
				.password(passwordEncoder().encode("admin")).roles("ADMIN").build();
		
		InMemoryUserDetailsManager detailsManager=new InMemoryUserDetailsManager(normal,admin);
		return detailsManager;
	}
	
	@SuppressWarnings("removal")
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
		httpSecurity.csrf().disable()
		.authorizeHttpRequests()

		.requestMatchers("/common/**")
		.permitAll()
		
		.requestMatchers("/admin/**")
		.hasRole("ADMIN")
		
		.requestMatchers("/normal/**")
		.hasRole("NORMAL")
		
		.anyRequest()
		.authenticated()
		.and()
		.formLogin();
		
		return httpSecurity.build();
	}
}
