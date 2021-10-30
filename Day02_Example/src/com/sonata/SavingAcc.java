package com.sonata;

public class SavingAcc extends OopsExample {
	SavingAcc(int id,String bal,double accBal)
	{
		super(id,bal,accBal);
	}
	public SavingAcc() {
		
	}

	public static void main(String[] args) {
		SavingAcc a1=new SavingAcc();
		a1.accNo=123;
		a1.accName="sam";
		a1.accBalance=230;
		a1.display();
		
		SavingAcc a2=new SavingAcc(123,"gfgf",235);
		a2.display();
		
		// TODO Auto-generated method stub

	}

}
