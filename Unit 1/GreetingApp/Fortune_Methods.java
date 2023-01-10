package com.ncu.GreetingApp;
import java.util.Scanner;

public class Fortune_Methods {
	static Scanner sc=new Scanner(System.in);
	
	public static int getNumber() {
		System.out.print("ENTER THE NO : ");
		int no=sc.nextInt();
		return no;
	}
	
	public static String getzodiac() {
		System.out.print("ENTER THE ZODIAC: ");
		String zodiac=sc.next();
		return zodiac;
	}
	
	
	
	

}
