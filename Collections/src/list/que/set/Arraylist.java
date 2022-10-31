package list.que.set;

import java.util.ArrayList;

public class Arraylist {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	a1.add(50);
	a1.add("vani");
	a1.add(89);
	a1.add("bye");
	a1.add(00);
	System.out.println(a1);
	System.out.println(a1.contains("vani"));
	System.out.println(a1.get(3));
	System.out.println(a1);
	a1.add(1,70);
	System.out.println(a1);
        	System.out.println(a1.size());
	a1.set(1, "hi");
	System.out.println(a1);
}
}
