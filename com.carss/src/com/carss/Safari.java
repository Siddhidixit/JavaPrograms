package com.carss;

	public  class Safari extends Tata{
		public void getDealers() {
			System.out.println("JV Motors");
		}
		public void getMilage() {
			System.out.println("30");
		}
		public void getColours() {
			System.out.println("White");
		}
		public void getPrice() {
			System.out.println("900000");
		}
		public void getFeatures() {
			System.out.println("Average");
		}
		public static void main(String [] args) {
			Safari ss=new Safari();
			ss.getDealers();
			ss.getMilage();
			ss.getColours();
			ss.getPrice();
			ss.getFeatures();
			ss.Tatainfo();
		}

}
