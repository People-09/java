package com.test.concepts;

import java.util.ArrayList;

public interface EmployeeDao {

	public ArrayList<Employee> displayEmployee();
	public ArrayList<Employee> addEmployee(Employee employee);
	public  ArrayList<Employee> updateEmployee(Employee employee);
	public ArrayList<Employee> deleteEmployee(Employee employee);
}
