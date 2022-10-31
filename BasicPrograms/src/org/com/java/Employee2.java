package org.com.java;

public class Employee2 {
	public static void main(String[] args) {
		Employee1 em = new Employee1();
		em.name();
		em.age();
		em.dob();
		em.role();
		
	}
}
	class Employee1 implements Employee
	{
public void name()
{
	System.out.println("employee name is vani");
}
public void age()
{
	System.out.println("employee age : "+ 22);
}
public void dob() {
	System.out.println("employee  dob : 01-03-2000");
}
public void status()
{
	System.out.println("single");
}
public void role()
{
	System.out.println("software engineer");
}
}
