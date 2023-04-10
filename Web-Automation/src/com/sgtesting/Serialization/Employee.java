package com.sgtesting.Serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	int empNo;
	String empName;
	String empJob;
	double Salary;
	
	Employee(int empNo,String empName,String empJob,double Salary)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.empJob=empJob;
		this.Salary=Salary;
	}
	
	public void ShowempNo()
	{
		System.out.println("Employee Number :"+empNo);
	}
	public void ShowempName()
	{
		System.out.println("Employee Name :"+empName);
	}
	public void ShowempJob()
	{
		System.out.println("Employee Job name :"+empJob);
	}
	public void ShowSalary()
	{
		System.out.println("Employee Salary :"+Salary);
	}
	
}
