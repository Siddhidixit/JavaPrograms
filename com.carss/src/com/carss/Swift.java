package com.carss;

public  class Swift extends MS {
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
		Swift ss=new Swift();
		ss.getDealers();
		ss.getMilage();
		ss.getColours();
		ss.getPrice();
		ss.getFeatures();
		ss.MSinfo();
	}

}


