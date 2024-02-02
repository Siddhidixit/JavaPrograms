package com.cars;

import java.util.Scanner;

public class Tata extends Cars{

	public static void settata() {
		System.out.println("One of the biggest car company in India ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Your Cars: ");
		System.out.println("1.Safari");
		System.out.println("2.Harrier ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Welcome to Safari");
			Safari ss=new Safari();
			ss.setsafari();
			break;
		case 2:
			System.out.println("Welcome to Harrier");
		    Harrier hh=new Harrier();
			hh.setharrier();
			break;
		}

	}

}
