package com.test.concepts;

import java.util.Scanner;

public class Provider {
	public static void displayData()
	{
		Scanner sc=new Scanner(System.in);
	    Employee employee = new Employee();
	   // employee.setPassword(sc.next());
	    EmployeeService service = new EmployeeService();
	    service.displayEmployee();
	    System.out.println("Data displayed..!!");
	}
public static void addData()
{
	Scanner sc=new Scanner(System.in);
	Employee employee = new Employee();
	System.out.println("Enter your name ");
	employee.setUsername(sc.next());
	System.out.println("Enter your password ");
    employee.setPassword(sc.next());
	EmployeeService service = new EmployeeService();
	service.addEmployee(employee);
	System.out.println("Data inserted..!!!");
}

public static void deleteData()
{
	Scanner sc=new Scanner(System.in);
    Employee employee = new Employee();
    EmployeeService service = new EmployeeService();
    service.deleteEmployee(employee);
	System.out.println("Data deleted..!!!");

}
public static void updateData()
{
	Scanner sc=new Scanner(System.in);
    Employee employee1 = new Employee();
    EmployeeService service = new EmployeeService();
    service.updateEmployee(employee1);
    System.out.println("Data updated..!!!");
}
}
