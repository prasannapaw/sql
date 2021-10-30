package com.sonata;

public class Manager extends Employee {
	Manager(int empid,String empname,int empsal)
	{
		super(empid,empname,empsal);
	}
	public Manager() {
		
	}

	 public int totalsal(int HRA,int DA)
	 {
		 super.totalsal(HRA, DA);
		 System.out.println("childclass");
		 return this.empsal+HRA+DA;
	     

	 }

	public static void main(String[] args) {
		Manager m1=new Manager();
		m1.empid=123;
		m1.empname="curran";
		m1.empsal=129;
		m1.display();
		
		Manager m2=new Manager(127,"drd",900);
		m2.display();
		System.out.println(m2.totalsal(30, 60));
		

	}

}
