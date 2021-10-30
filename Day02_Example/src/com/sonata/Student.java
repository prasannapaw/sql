package com.sonata;

public class Student {
	
	int stdID;
	String stdName;
	double stdMarks;
	
	Student(int id,String name,double marks)
	{
		this.stdID=id;
		this.stdName=name;
		this.stdMarks=marks;
	}
	 public double totalMarks(int p,int c,int m)
	 {
		 return this.stdMarks+p+c+m;
	 }
	 public void display()
	 {
		 System.out.println(stdID);
		 System.out.println(stdName);
		 System.out.println(stdMarks);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(123, "prasanna",70);
        s1.display();
        System.out.println(s1.totalMarks(10,20,30));

	}

}
