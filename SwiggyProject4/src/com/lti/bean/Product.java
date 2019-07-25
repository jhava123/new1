package com.lti.bean;

//default constructor
public class Product {
	private int pid;
	private String pname;
	private double price;

	
//default constructor	
	public Product() {
	pid=1;
	pname="food";
	price=1.0;
	}
	
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}



	public void setPid(int pid)
	{
		if(pid>0)
		{
		this.pid=pid;
		}
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPid()
	{
		return pid;
	}
	
	//destructor
	public void finalize()
	{
		System.out.println("Destroying object of pid"+pid);
	}
public String display()
{
	String s="PRODUCT ID= "+pid+"\n"+"PRODUCT NAME= "+pname+"\n"+"PRODUCT PRICE= "+price;
	return s;
}
}
