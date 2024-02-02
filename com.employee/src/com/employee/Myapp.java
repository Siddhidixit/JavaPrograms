package com.employee;
import java.util.Scanner;
public class Myapp {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("press 1 for set employee data\npress 2 for get employee data");
			switch(sc.nextInt()) {
			case 1:
				App.setData();
				break;
			case 2:
				App.getData();
				break;
			}
			
		}
	}

}
