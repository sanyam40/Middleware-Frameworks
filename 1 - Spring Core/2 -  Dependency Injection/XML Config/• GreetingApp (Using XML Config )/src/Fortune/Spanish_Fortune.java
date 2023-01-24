package com.ncu.GreetingApp;

public class Spanish_Fortune implements Fortune_Teller{
	
	public String tellFortune() {
		
		String arr[]=new String[10];
		arr[0]="tendrás un buen día";
		arr[1]="tendrás un mal día";
		arr[2]="tendrás un buen día";
		arr[3]="tendrás un mal día";
		arr[4]="tendrás un buen día";
		arr[5]="tendrás un mal día";
		arr[6]="tendrás un buen día";
		arr[7]="tendrás un mal día";
		arr[8]="tendrás un buen día";
		arr[9]="tendrás un mal día";
		
		int no=Fortune_Methods.getNumber();
		String zodiac=Fortune_Methods.getzodiac();
		int b=zodiac.length();
		int res=(no+b)%(arr.length);
		
		return arr[res];

	}
	}

