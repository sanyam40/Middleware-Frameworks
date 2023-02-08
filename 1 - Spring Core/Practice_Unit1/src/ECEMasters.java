package com.ncu.Practice_Unit1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// --> @Component Annotation only used in Annotation based not java based
// @Component
public class ECEMasters implements MasterDegree{
	
	// TO BE USED IN ANNOTATION CONFIGURTION
	/*private ECEBach ece_b;
	
	public ECEMasters(@Qualifier("ECEBach")ECEBach ece_b) {
		this.ece_b=ece_b;	
	}*/
	
	public void getDetails() {
		ECEBach ece_b=new ECEBach();
		ece_b.getcgpa();
		System.out.println("YOUR CGPA FOR ECE MASTER DEGREE IS 10");
	}
}
