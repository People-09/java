package com.java.Interface;

interface Phone 
{

	void call();
	default void message()
	{
		System.out.println("sent");
	}
}
class AndroidPhone implements Phone
{
	public void call()
	{
		System.out.println("Callig");
	}
}
public class DemoInterface {

	public static void main(String[] args) {
		
		 Phone p = new AndroidPhone();
		 p.call();
		 p.message();
	}
}
