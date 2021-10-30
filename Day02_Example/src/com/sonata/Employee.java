package com.sonata;

public class Employee {
int empid;
String empname;
int empsal;

Employee(){
}

 Employee(int a,String n,int sal) {
	 this.empid=a;
	 this.empname=n;
	 this.empsal=sal;
	 
	// TODO Auto-generated constructor stub
}
 
 
 public int totalsal(int HRA,int DA)
 {
	 System.out.println("parent class");
	 return this.empsal+HRA+DA;
     

 }
 public void display()
 {
	 System.out.println(empid);
	 System.out.println(empname);
	 System.out.println(empsal);
	 
	
	
 }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Employee b1=new Employee();
		b1.empid=123;
		b1.empname="prasanna";
		b1.empsal=2345;
		b1.display();
	    System.out.println(b1.totalsal(30, 60));


		

	}

}
