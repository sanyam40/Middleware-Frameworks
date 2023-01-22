package com.ncu.GreetingApp;

public class French_Fortune implements Fortune_Teller{
	
	public String tellFortune() {
		int no=Fortune_Methods.getNumber();
		String zodiac=Fortune_Methods.getzodiac();
		int b=zodiac.length();
		
		String fortune[]=new String[10];
		fortune[0]="Vous passerez une bonne journée";
		fortune[1]="tu vas passer une mauvaise journée";
		fortune[2]="Vous passerez une bonne journée";
		fortune[3]="tu vas passer une mauvaise journée";
		fortune[4]="Vous passerez une bonne journée";
		fortune[5]="tu vas passer une mauvaise journée";
		fortune[6]="Vous passerez une bonne journée";
		fortune[7]="tu vas passer une mauvaise journée";
		fortune[8]="Vous passerez une bonne journée";
		fortune[9]="tu vas passer une mauvaise journée";
		
		int res=(no+b)%(fortune.length);
		
		return fortune[res];
		
	}

}
