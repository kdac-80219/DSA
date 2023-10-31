package com.sunbeam;

import java.util.Scanner;

public class Employee {

	private int empId;
	private String name;
	private double salary;
	
	public Employee() {
		super();
	}
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]\n";
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Empid = ");
		this.empId = sc.nextInt();
		System.out.println("Enter Name = ");
		this.name = sc.next();
		System.out.println("Enter Salary = ");
		this.salary = sc.nextDouble();
	}
	
}
