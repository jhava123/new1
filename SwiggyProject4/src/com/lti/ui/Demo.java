package com.lti.ui;
import com.lti.bean.*;
public class Demo {

	public static void main(String[] args) {
		
		Product ob1=new Product();
		Product ob2=new Product();
		
		ob1.setPid(100);
		ob1.setPname("Burger");
		ob1.setPrice(100.00);
		int p=ob1.getPid();
		String s=ob1.getPname();
		double p1=ob1.getPrice();
		System.out.println("PRODUCT ID= "+p +"\nPRODUCT NAME= "+s+"\nPRODUCT PRICE="+p1);
		
		ob2.setPid(200);
		ob2.setPname("Pizza");
		ob2.setPrice(200.00);
		int p2=ob2.getPid();
		String s1=ob2.getPname();
		double p3=ob2.getPrice();
		System.out.println("PRODUCT ID= "+p2+"\nPRODUCT NAME= "+s1+"\nPRODUCT PRICE="+p3);
		
		ob1=null;
		System.gc();
		//String res=ob1.display();
	//	System.out.println(res);
	
	}

}
