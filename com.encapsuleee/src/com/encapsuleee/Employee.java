//Encapsulation using this keyword

package com.encapsuleee;

public class Employee {   //Global Variable
	private static int empId;
	private String name;
	private String designation;
	public void setEmpId(int empId) {    //(Setter method)
		this.empId=empId;
	//public void setname(String name) {
		//this.name=name;
	}
	//public int getEmpId(){   //(getter method)
    //return empId;
	//}

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpId(80);
	System.out.println(empId);               // while using setter 
	//System.out.println(emp.getEmpId());   // while using getter 
		
		
	}
	
	
	

}



