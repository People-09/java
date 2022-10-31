package com.java.Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//forEach Methods in  java

//External Loops
//Internal Loops in java 8
public class DemoForEach {
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
//		for(int i=0; i<values.size(); i++)
//		{
//			System.out.println(values.get(i));+                              
//		}
		
//		for(int i : values)
//		{
//			System.out.println(i);
//		}
		 
		//values.forEach(i -> System.out.println(i)); //Lambda
		
//		Consumer<Integer> c = new Consumer<Integer>() 
//		{  create anonymous class with the help of consumer interface
//
//			@Override
//			public void accept(Integer i) {
//               System.out.println(i);				
//			}
//			
//		};	              
//	   values.forEach(c);
		
		Consumer<Integer> c =  i -> System.out.println(i);		
		 values.forEach(c);
	}
}

// class ConsImpl implements Consumer<Integer>
//{
//	public void accept(Integer i)
//	{
//		System.out.println(i);
//	}
//}
  