package com.ncu.Practice_Unit1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ECEMasters implements MasterDegree{
	
	private ECEBach ece_b;
	
	public ECEMasters(@Qualifier("ECEBach")ECEBach ece_b) {
		this.ece_b=ece_b;	
	}
	
	public void getDetails() {
		ece_b.getcgpa();
		System.out.println("YOUR CGPA FOR ECE MASTER DEGREE IS 10");
	}
}
