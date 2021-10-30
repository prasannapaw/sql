package com.sonata1;

public class product {
	int prodID;
	String prodName;
	double prodPrice;
	
	public product(int id,String name,double price) {
		this.prodID=id;
		this.prodName=name;
		this.prodPrice=price;
	}
	
	public double calculate(int gst)
	{
		return this.prodPrice+gst;
	}   
	
	public void display()
	{
		System.out.println(prodID);
		System.out.println(prodName);
		System.out.println(prodPrice);
	}
	public static void main(String[] args) {
		product p1=new product(23,"soap",80);
		p1.display();
		System.out.println(p1.calculate(20));
		
	}
		

	}


