package list;
import java.util.*;

public class likedlist {
	public static void main(String[] agrs) {
	LinkedList<String> list= new LinkedList<String>();
	list.add("hi");
	list.add("java");
	list.add("welcome");
	list.add("raham");
	System.out.println("my list is :"+list);
	System.out.println(list.remove(1));
	for(int i=0;i<list.size();i++) {
		String hr=list.get(i);
		System.out.println(hr);
		
	}
	ListIterator<String> l=list.listIterator(1);
	while(l.hasNext()) {
		System.out.println(l.next());
	}
}
}