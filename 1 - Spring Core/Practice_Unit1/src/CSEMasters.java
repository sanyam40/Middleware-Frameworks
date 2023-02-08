package com.ncu.Practice_Unit1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//--> @Component Annotation only used in Annotation based not java based
// @Component 
public class CSEMasters implements MasterDegree{
	
	// TO BE USED IN ANNOTATION CONFIGURTION
	//private CSEBach cse_b;
	
	/*public CSEMasters(@Qualifier("CSEBach")CSEBach cse_b) {
		this.cse_b=cse_b;
	}*/
	
	@Override
	public void getDetails() {
		CSEBach cse_b=new CSEBach();
		cse_b.getcgpa();
		System.out.println("YOUR CGPA FOR CSE MASTER DEGREE IS 9.8");
	}
}
