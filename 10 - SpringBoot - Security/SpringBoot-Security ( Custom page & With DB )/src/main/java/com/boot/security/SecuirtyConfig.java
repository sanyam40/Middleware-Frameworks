package com.boot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
//@EnableMethodSecurity
public class SecuirtyConfig{
	
	@Autowired
	private CustomUserDetailService customUserDetailService;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails normal=User.withUsername("sanyam")
//				.password(passwordEncoder().encode("sanyam")).roles("NORMAL").build();
//		
//		UserDetails admin=User.withUsername("admin")
//				.password(passwordEncoder().encode("admin")).roles("ADMIN").build();
//		
//		InMemoryUserDetailsManager detailsManager=new InMemoryUserDetailsManager(normal,admin);
//		return detailsManager;
//	}
	
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());
	}
	
	@SuppressWarnings("removal")
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
		
		// Cross site request forgery token. we have disable it for non-browser clients.
		httpSecurity.csrf((csrf) -> csrf.disable());

		httpSecurity.authorizeHttpRequests((authorizeHttpRequests) ->
			authorizeHttpRequests
			
			.requestMatchers("/login")
			.permitAll()
			
			.requestMatchers("/common/**")
			.permitAll()
			
			.requestMatchers("/admin/**")
			.hasRole("ADMIN")
			
			.requestMatchers("/normal/**")
			.hasRole("NORMAL")
				
		)
//		.httpBasic() // for prompt based login system 
		.formLogin().loginPage("/login")
		.loginProcessingUrl("/doLogin")
		.defaultSuccessUrl("/common/method");

		return httpSecurity.build();
	}
}
