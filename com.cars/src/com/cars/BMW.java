//Inheritance

package com.cars;

import java.util.Scanner;

public class BMW extends Cars{

	public static void setbmw() {
		System.out.println("BMW is one the biggest car company in the world");
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Your Cars: ");
		System.out.println("1. X5");
		
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Welcome to BMW");
			BMW bb=new BMW();
			bb.setbmw();
			break;
		

	}
	}
}
