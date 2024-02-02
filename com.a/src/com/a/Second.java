// Access Specifier

package com.a;

public class Second {
	private String pvt="Private";
	public String pub="Public";
	String def="Defualt";
	protected String prf="Protected";
	public static void main(String[]args) {
		First ft=new First();
		//System.out.println("Private "+ft.pvt);
		System.out.println("Public "+ft.pub);
		System.out.println("Defualt "+ft.def);
		System.out.println("Protected "+ft.prf);
		
	
	}

}
