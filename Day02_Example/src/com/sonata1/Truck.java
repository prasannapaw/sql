package com.sonata1;

public class Truck extends Car {
	int weight; 


	
	public Truck(int speed,double regularPrice,String color,int weight) {
		super(speed,regularPrice,color);
		this.weight=weight;
		
	}
	
	public double getSalePrice()
	{
		return super.getSalePrice()*(weight>2000?.90:.80);
	}
	public static void main(String[] args) {
		

	}

}
