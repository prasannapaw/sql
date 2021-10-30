package com.sonata;

public class OopsExample {
	int accNo;
	String accName;
	double accBalance;
	
	OopsExample(){};
	OopsExample(int a,String n ,double b)
	{
		this.accNo=a;
		this.accName=n;
		this.accBalance=b;
		
	}
	
	public double deposit()
	{
		return accBalance=accBalance+10;
		
	}
	public double withdraw()
	{
		return accBalance=accBalance-10;
	}
	public void display()
	{
		System.out.println(accNo);
		System.out.println(accName);
		System.out.println(accBalance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopsExample b1=new OopsExample();
		b1.accNo=123;
		b1.accName="prasanna";
		b1.accBalance=238.9;
		b1.display();
		

	}

}
