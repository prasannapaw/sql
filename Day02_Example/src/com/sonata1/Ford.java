package com.sonata1;

public class Ford extends Car {
	int year; 

	int manufacturerDiscount; 

	public Ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount) {
		super(speed,regularPrice,color);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
		
		
		
	}
	public double getSalePrice()
	{
		return super.getSalePrice()-manufacturerDiscount;
	}
	public void display()
	 {
		 System.out.println(speed);
		 System.out.println(regularPrice);
		 System.out.println(color);
		 System.out.println(year);
		 System.out.println(manufacturerDiscount);
	 }
	public static void main(String[] args) {
		Ford f1=new Ford(300,800,"blue",2014,35);
		f1.display();
		System.out.println(f1.getSalePrice());
		
		Ford f2=new Ford(200,400,"black",2017,20);
		f1.display();
		System.out.println(f2.getSalePrice());
		
		

	}

}
