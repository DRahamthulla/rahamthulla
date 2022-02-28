package list;

import java.util.Vector;

public class vector {
	public static void main(String[] agrs) {

	Vector<String> v1=new Vector<String>();  
	v1.add("hi");
	v1.add("Amit");  
	v1.add("Ashish");  
	v1.add("Garima");
	System.out.println(v1);
	System.out.println(v1.add("raham"));
	System.out.println(v1);
	System.out.println(v1.remove(0));
	System.out.println(v1);
	}
	

}
