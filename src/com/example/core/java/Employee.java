package com.example.core.java;

public class Employee{
	static int eid;
	String eName;
	int Salary;
	
	public Employee(String eName,int Salary) {
		//this.eid=eid;
		this.eName=eName;
		this.Salary=Salary;
		eid++;
	}
	public static void getDetails() {
		System.out.println("this is static method");
	}
	public void getEmployeedetails() {
		System.out.println("eid: "+eid+",Name: "+eName+",Salary:"+Salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee("abc",2500);
		e1.getEmployeedetails();
		
        Employee e2= new Employee("xyz",3500);
		e2.getEmployeedetails();
		Employee.getDetails();
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	

}
