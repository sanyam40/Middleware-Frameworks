package com.ncu.Practice_Unit1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//--> @Component Annotation only used in Annotation based not java based
// @Component
public class DegreeClass {
	
	private MasterDegree CSEMasters;
	private MasterDegree ECEMasters;
	
	@Autowired
	public DegreeClass(@Qualifier("CSEMasters")MasterDegree CSEMasters,@Qualifier("ECEMasters")MasterDegree ECEMasters) {
		this.CSEMasters=CSEMasters;
		this.ECEMasters=ECEMasters;
	}
	
	public void cgpa(String degree) {
		if(degree=="CSE") {
			this.CSEMasters.getDetails();
		}
		else if(degree=="ECE") {
			this.ECEMasters.getDetails();
		}
		else {
			throw new RuntimeException ("SORRY, "+degree+" function not found.");
		}
	}
}
