package com.carss;

	public  class Nexon extends Tata{
		public void getDealers() {
			System.out.println("JV Motors");
		}
		public void getMilage() {
			System.out.println("20");
		}
		public void getColours() {
			System.out.println("Flame Red");
		}
		public void getPrice() {
			System.out.println("900000");
		}
		public void getFeatures() {
			System.out.println("Average");
		}
		public static void main(String [] args) {
			Nexon nn=new Nexon();
			nn.getDealers();
			nn.getMilage();
			nn.getColours();
			nn.getPrice();
			nn.getFeatures();
			nn.Tatainfo();
			
		}

}