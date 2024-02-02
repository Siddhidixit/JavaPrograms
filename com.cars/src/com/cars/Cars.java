package com.cars;
import java.util.Scanner;

public class Cars {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Your Cars: ");
		System.out.println("1. Tata");
		System.out.println("2. BMW ");
		System.out.println("3. Mahindra");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Welcome to Tata");
			Tata tt=new Tata();
			tt.settata();
			break;
		case 2:
			System.out.println("Welcome to BMW");
			BMW bb=new BMW();
			bb.setbmw();
			break;
		case 3:
			System.out.println("Welcome to Mahindra");
			Mahindra mm=new Mahindra();
			mm.setmahindra();
			break;
			
		}
		

	}

}
