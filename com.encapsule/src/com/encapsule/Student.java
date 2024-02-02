//Encapsulation
//Binding the data in a single unit e.g. Medical Capsule 

package com.encapsule;

public class Student {
	int rollNo;
	String name;
	String dept;
	
	@Override// object is the parent of these class i.e String
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dept=" + dept + "]";
	}
	public static void main(String [] args) {
		Student st=new Student();
		st.rollNo=23;
		st.name="Siddhi";
		st.dept="Computer";
		System.out.println(st);
		//System.out.println(st.name);
	}
}

