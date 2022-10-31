package list.que.set;
//step2: import from java.util package

import java.util.Vector;

public class Vect {
public static void main(String[] args) {
	//step-1:Creation of object
	
	Vector v = new Vector();
	
	//step3: adding/inserting elements
	v.add(20);
	v.add(30);
	v.add("hello");
	v.add(40);
	v.add("null");
	
	//step4: searching a particular element
	System.out.println(v.contains(20));
	
	//step5: fetching the all elements
	System.out.println(v);
	
	//step6: fetch a particular element
	System.out.println("1st index value is : "+v.get(1));
	
	//step7:deletion
	System.out.println(v.remove(1));
	System.out.println(v);
	
	//step8: modification of a particular element
	System.out.println(v.set(2, "hi"));
	System.out.println(v);
	
	//step9: modification of list
	v.add(1,"welcome");
	System.out.println(v);
	System.out.println(v.isEmpty());
	
	//step10: delete all the elements
	v.clear();
	System.out.println(v);
	System.out.println(v.isEmpty());
}
}
