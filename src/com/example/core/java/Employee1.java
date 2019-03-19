package com.example.core.java;

public class Employee1 extends Person {
	
	int Salary;
	String Designation;
	
	public Employee1(String name,String gender,double age,int salary,String designation) {
		super(name, gender, age);
		this.Salary=salary;
		this.Designation=designation;
	}
	
	public static void main(String[] args) {
		Employee1 emp1=new Employee1("abc","female",56,5000,"soft-dev");
		System.out.println(emp1.Designation);
		System.out.println(emp1.getName());
	}
}
