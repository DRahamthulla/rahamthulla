package map;

import java.util.Iterator;
import java.util.Map;

import java.util.TreeMap;
import java.util.Set;


class Main {

    public static void main(String[] args) {
        // Creating Map using TreeMap
        Map<String, Integer> values = new TreeMap<>();

        // Insert elements to map
        values.put("Second", 2);
        values.put("First", 1);
        System.out.println("Map using TreeMap: " + values);

        // Replacing the values
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("New Map: " + values);

        // Remove elements from the map
        int removedValue = values.remove("First");
        System.out.println("Removed Value: " + removedValue);
        
		Set<String> keys=values.keySet();
		Iterator<String> it=keys.iterator();
		while (it.hasNext());{
			  String keys1= it.next();
			  System.out.println(keys+ ":" +keys1 );
			  
	
		}
        

    }
}
