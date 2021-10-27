package org.sample;

public class Employee  extends Client{
	
	public void empId() {
		System.out.println("emp id is 900");

	}
	public void empName() {
		System.out.println("emp nmae is navi");

	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId();
		e.empName();
		
	Client.clientId();
	Client.clientName();
		
	}

}
