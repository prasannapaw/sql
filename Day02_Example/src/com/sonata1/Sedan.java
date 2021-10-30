package com.sonata1;

public class Sedan extends Car {
	int length; 
    
	
	public Sedan(int speed,double regularPrice,String color,int length) {
		super(speed,regularPrice,color);
		this.length=length;
		
	}
	public double getSalePrice()
	{
		return super.getSalePrice()*(length<20?.95:.90);	
		}
	public void display()
	 {
		 System.out.println(speed);
		 System.out.println(regularPrice);
		 System.out.println(color);
		 System.out.println(length);
	 }
	public static void main(String[] args) {
		Sedan s1=new Sedan(200,500,"red",15);
		s1.display();
		System.out.println(s1.getSalePrice());

	}

}
