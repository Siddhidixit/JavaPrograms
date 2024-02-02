//encapsulation

package com.employee;

//import com.encapsuleee.Employee;

public class Employee {
	private static int empid;
	private String name;
	private String salary;
	public void setEmpId(int empid) {
		this.empid=empid;
	}
	public int getEmpId() {
		return empid;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(String salary) {
		this.salary=salary;
	}
	public String getSalary() {
		return salary;
	}
	public static void main(String[]args) {
		Employee emp=new Employee();
		emp.setEmpId(800);
		emp.setName("siddhi");
		emp.setSalary("90090");
		System.out.println(empid);
		System.out.println("name");
		System.out.println("Salary");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
	}

}
