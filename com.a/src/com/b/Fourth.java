// Access Specifier

package com.b;

import com.a.First;

public class Fourth extends First {

	public static void main(String[]args) {
		Fourth ft=new Fourth();
		//System.out.println("Private "+ft.pvt);
		System.out.println("Public "+ft.pub);
		//System.out.println("Defualt "+ft.def);
		System.out.println("Protected "+ft.prf);
		
	
	}

}
