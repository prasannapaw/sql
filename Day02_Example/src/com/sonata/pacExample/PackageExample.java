package com.sonata.pacExample;

public class PackageExample {
	private int add(int a,int b)
	{
		return a+b;
	}
	
	int sub(int a,int b)
	{
		return b-a;
	}
	protected int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args)
	{
		PackageExample a1=new PackageExample();
		a1.add(10,20);
		a1.sub(10, 20);
		a1.mul(10, 20);
		a1.div(20, 10);
				}
	

}
