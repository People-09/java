package org.com.java;

class P
{
	public void bike()
	{
		System.out.println("  Bikes are start with kick or self start ");
	}
	}
class Q extends P
{
	public void honda()
	{
		System.out.println("honda bike start with kick");
	}
}
class R extends Q
{
	public void hero()
	{
		System.out.println("hero bike start with self start");
	}
}
public class Inheritance {
public static void main(String[] args) {
	R r = new R();
	r.hero();
	r.honda();
	r.bike();
}
}