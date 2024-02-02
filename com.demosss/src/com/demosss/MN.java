package com.demosss;

public class MN {
	{
		System.out.println("Inside in Non-Static Block");
	}
	public void m1() {
		MN nn=new MN();
		System.out.println("M1");
	}
	public static void main(String [] args) {
		MN nn=new MN();
		nn.m1();
	}

}
