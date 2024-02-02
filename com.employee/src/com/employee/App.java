package com.employee;

import java.util.Scanner;

public class App {
	static Scanner sc=new Scanner(System.in);
	static Employee emp=new Employee();
	public static void setData(){
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		emp.setEmpId(id);
		System.out.println("Enter Employee Name");
		String name=sc.next();
		emp.setName(name);
		System.out.println("Enter Employee Salary");
		String salary=sc.next();
		emp.setSalary(salary);
		}
	public static void getData() {
		System.out.println("Employee Id is"+emp.getEmpId());
		System.out.println("Employee Name is"+emp.getName());
		System.out.println("Employee Salary is"+emp.getSalary());
		
		
	}

}

