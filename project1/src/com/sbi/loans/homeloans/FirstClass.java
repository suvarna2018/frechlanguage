package com.sbi.loans.homeloans;

public class FirstClass implements SecondProject {
	int a=1,b=2,result=0;
	public void addition() {
		result=a+b;
		System.out.println("addition of a&b is:"+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass obj=new FirstClass();
		obj.addition();
		obj.multiplicatoin();
	}

	@Override
	public void multiplicatoin() {
		// TODO Auto-generated method stub
		System.out.println("multiplication overriding second project");
	}

}
