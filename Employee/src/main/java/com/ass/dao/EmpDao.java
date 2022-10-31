package com.ass.dao;

import java.util.ArrayList;

import com.ass.Model.Employee;

public interface EmpDao {

	public ArrayList<Employee> addEmployee();
	public void deleteEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public ArrayList<Employee> displayEmployee(Employee employee);
}
