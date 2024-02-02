//Polymorphism(Method Overloading)

package com.d;

public class First {

	public void m1() {
		System.out.println("No Parameters");
	}
	public void m1(int a) {
		System.out.println("int Parameter");
	}
	public void m1(int a,int b) {
		System.out.println("int 1, int 2 Parameter");
	}
	public void m1(float c) {
		System.out.println("Float Parameter");
	}
	public static void main(String[] args) {
		First ft=new First();
		ft.m1(2.45f);
		ft.m1(23);
		ft.m1(45,67);
		ft.m1();
	
		

	}

}
