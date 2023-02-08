package com.ncu.Practice_Unit1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan Annotation only used in Annotation based CONFIGURATION not java based CONFIGURATION
// @ComponentScan("com.ncu.Practice_Unit1")
public class ConfigAnnotation {
	
	// --> BELOW CODE ONLY TO BE ADDED IN JAVA BASED CONFIGURATION NOT ANNOTATION BASED
	
	ECEBach ece_b;
	CSEBach cse_b;
		
	// Dependent Class
	
	@Bean
	DegreeClass Degree() {
		return new DegreeClass(CSEMasters(),ECEMasters());
	}
	
	// Dependencies
	
	@Bean
	MasterDegree CSEMasters() {
		return new CSEMasters();
	}
	
	@Bean
	MasterDegree ECEMasters() {
		return new ECEMasters();
	}
}
