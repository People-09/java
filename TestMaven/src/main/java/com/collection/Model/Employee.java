package com.collection.Model;

public class Employee {

	 int id;
	 String name;
	 String add;
	 String zip;
	 
	public Employee(int id, String name, String add, String zip) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.zip = zip;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	}


