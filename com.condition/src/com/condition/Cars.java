package com.condition;

import java.util.Scanner;

public class Cars {
	public static void main(String[] args) {
		System.out.println("Choose your car company");
		Scanner sc=new Scanner(System.in);
		System.out.println("Press for Tata\n Press 2 for Toyata");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Welcome to Tata");
			Operations.getTata();
			break;
		case 2:
			System.out.println("Welcome to Toyata");
			break;
		case 3:
			System.out.println("Welcome to Mahindra");
			break;
		
	
		}
	}

}
