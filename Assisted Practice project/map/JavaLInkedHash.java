package map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaLInkedHash {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> ind=new LinkedHashMap<Integer, String>();
		ind.put(7, "Dohin");
		ind.put(12,"virat");
		ind.put(90,"rohit");
		System.out.println(ind);
		Set<Entry<Integer,String>> set=ind.entrySet();
		 for(Entry<Integer,String> entry:set) {
			 System.out.println(entry);
			 
		 }

	}

}
