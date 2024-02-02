package com.carss;

public  class Dzire extends MS {
	public void getDealers() {
		System.out.println("JV Motors");
	}
	public void getMilage() {
		System.out.println("10");
	}
	public void getColours() {
		System.out.println("Gray");
	}
	public void getPrice() {
		System.out.println("800000");
	}
	public void getFeatures() {
		System.out.println("Fastest Speed");
	}
	public static void main(String [] args) {
		Dzire dd=new Dzire();
		dd.getDealers();
		dd.getMilage();
		dd.getColours();
		dd.getPrice();
		dd.getFeatures();
		dd.MSinfo();
	}

}

