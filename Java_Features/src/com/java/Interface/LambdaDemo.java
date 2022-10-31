package com.java.Interface;


interface A
{
	void show(int i);
}
//class Xyz implements A
//{
//	public void show(int i)
//	{
//		System.out.println("Hello"+ i);
//	}
//}
public class LambdaDemo {

	public static void main(String[] args) {

		A obj;
//		obj= new A()		
//	{
//			public void show(int i)
//			{
//				System.out.println("Hello"+i);
//			}
//			};
				
//				obj = () ->
//		{
//			System.out.println("Hello");
//		};
//			obj.show();
		obj = (int i) -> System.out.println("Hello "+ i);  //Lambda consuma
		obj.show(9);
	}

}
