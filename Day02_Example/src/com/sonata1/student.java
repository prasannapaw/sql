package com.sonata1;

public class student {
	int stdID;
	String StdName;
	int StdClass;
	  
	public student() {
		
	}
	
	public student(int id, String name,int stdclass) {
		this.stdID=id;
		this.StdName=name;
		this.StdClass=stdclass;
		
	}
	public void display()
	{
		System.out.println(stdID);
		System.out.println(StdName);
		System.out.println(StdClass);
	}

	public static void main(String[] args) {
		student s1=new student(123,"prasanna",5);
		s1.display();
		
	}

}
