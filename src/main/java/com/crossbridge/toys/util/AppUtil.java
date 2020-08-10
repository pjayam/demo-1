package com.crossbridge.toys.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AppUtil {
	
	public static HashMap<String,Integer> toysPrice = null;
	public static HashMap<String,Integer> toysPresent = null;

	static {
		
		toysPresent = new HashMap<String, Integer>();
		toysPresent.put("A", 1);
		toysPresent.put("B", 10);
		toysPresent.put("C", 5);
		toysPresent.put("D", 3);
		toysPresent.put("E", 0);

		toysPrice = new HashMap<String, Integer>();
		toysPrice.put("A", 5);
		toysPrice.put("B", 1);
		toysPrice.put("C", 3);
		toysPrice.put("D", 2);
		toysPrice.put("E", 8);
		
	}

	// sort elements by values
	public static Map<String, Integer> sortByValue(HashMap<String, Integer> map) {		
		Map<String,Integer> sortedIdNameMap 
        = map.entrySet()
                   .stream()
                   .sorted(Entry.comparingByValue())
                   .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,  e2) -> e1, LinkedHashMap::new));
 
         
        //Print idNameMap before and after sorting
         
        System.out.println("Before Sorting : ");
         
        System.out.println(map);
         
        System.out.println("After Sorting : ");
         
        System.out.println(sortedIdNameMap);
        
        
		
		return sortedIdNameMap;

	}

}
