package list;

import java.util.ArrayList;

public class Testarraylist {
	




	public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<String>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		

		
		a1.add("ravi");
		a1.add("raham");
		a1.add("ramiji");
		System.out.println("print my list"+a1);
		a2.add(9);
		a2.add(66);
		a2.add(5);
		System.out.println("print my list"+a2);
		for(int i=0;i<a2.size();i++){
			String clr=a1.get(i);
			System.out.println(clr);
		}
		for(int i=0;i<a1.size();i++) {
			Integer cl=a2.get(i);
			System.out.println(cl);
		}

	}

}
