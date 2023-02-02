package com.ncu.GreetingApp;

import org.springframework.stereotype.Component;

@Component
public class English_Fortune implements Fortune_Teller{
	
	public String tellFortune() {
		int no=Fortune_Methods.getNumber();
		String zodiac=Fortune_Methods.getzodiac();
		int b=zodiac.length();
		
		String fortune[]=new String[10];
		fortune[0]="You will have a good day";
		fortune[1]="You will have a bad day";
		fortune[2]="You will have a good day";
		fortune[3]="You will have a bad day";
		fortune[4]="You will have a good day";
		fortune[5]="You will have a bad day";
		fortune[6]="You will have a good day";
		fortune[7]="You will have a bad day";
		fortune[8]="You will have a good day";
		fortune[9]="You will have a bad day";
		
		int res=(no+b)%(fortune.length);
		
		return fortune[res];

		
	}

}
