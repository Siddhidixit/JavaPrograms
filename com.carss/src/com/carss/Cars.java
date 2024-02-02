//Abstraction
package com.carss;
import java.util.Scanner;
public class Cars {
	public static void getSwift() {
		Swift ss=new Swift();
		ss.getDealers();
		ss.getMilage();
		ss.getColours();
		ss.getPrice();
		ss.getFeatures();
		ss.MSinfo();		
	}
	public static void getSafari() {
		Safari ss=new Safari();
		ss.getDealers();
		ss.getMilage();
		ss.getColours();
		ss.getPrice();
		ss.getFeatures();
		ss.Tatainfo();
	}
	public static void getDzire() {
		Dzire dd=new Dzire();
		dd.getDealers();
		dd.getMilage();
		dd.getColours();
		dd.getPrice();
		dd.getFeatures();
		dd.MSinfo();
	}
	public static void getNexon() {
		Nexon nn=new Nexon();
		nn.getDealers();
		nn.getMilage();
		nn.getColours();
		nn.getPrice();
		nn.getFeatures();
		nn.Tatainfo();
	}
	 public static void main(String args[]) {
   	  int count = 0;
   	  while(count<3) {
   	  System.out.println( );
   	  System.out.println("choose your favorite Car Company:");
   	  System.out.println("press 1 for Maruti Suzuki \npress 2 for Tata  ");
   	  Scanner sc = new Scanner(System.in);
   	  int ch = sc.nextInt();
   	  switch(ch){
   	  case 1:
   		  System.out.println("press 1 for Swift \npress 2 for Dzire ");
   		  int n1 = sc.nextInt();
   		  if(n1==1) {
   			  getSwift();
   		  }
   		  else {
   			  getDzire();
   		  }
   		  break;
   		  
   	  case 2:
   		  System.out.println("press 1 for Safari \npress 2 for Nexon ");
   		  int n2 = sc.nextInt();
   		  if(n2==1) {
   			  getSafari();
   		  }
   		  else {
   			  getNexon();
   		  }
   		  break;
   	  default:
   		  System.out.println("Invalid ");	  
   	  }
   	  count++;
   	  }
     }
  } 


