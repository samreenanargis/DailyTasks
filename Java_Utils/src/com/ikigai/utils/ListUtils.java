package com.ikigai.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class ListUtils {
	
	/*
	 * This method accepts LinkedHashSet as argument and checks if it is null.
	 * If it is null, it returns false; else it returns true..
	 */
	public boolean isListNotNull(LinkedHashSet<String> list) {
		
		return (list != null) ? true : false;
	}
	
	
	/*
	 * This method accepts LinkedHashSet as argument and checks if it is empty.
	 * If it is empty, it returns false; else it returns true..
	 */
	public boolean isListNotEmpty(LinkedHashSet<String> list) {
		
		return (!list.isEmpty()) ? true : false;
	}
	
	
	/*
	 * This method accepts a List as argument and checks if it is null.
	 * If it is null, it returns false; else it returns true.
	 */
	public boolean isListNotNull(List list) {
		
		return (list != null) ? true : false;
	}
	
	
	/*
	 * This method accepts a List as argument and checks if it is empty.
	 * If it is empty, it returns false; else it returns true..
	 */
	public boolean isListNotEmpty(List list) {
		
		return (!list.isEmpty()) ? true : false;
	}
	
	
	/*
	 * This method accepts a LinkedHashSet and a List as arguments.
	 * It checks if their size is the same. 
	 * If their size is 
	 */
	public boolean isListsOfSameSize(LinkedHashSet<String> keyList, List valueList) {
		
		return (keyList.size() != valueList.size()) ? false : true;
	}
	
	
	/*
	 * This method accepts a LinkedHashSet and a List as arguments.
	 * First, it checks if the LinkedHashSet and List are of the same size. 
	 * Next, it checks if either of the two parameters are null or empty.
	 * Finally it adds the values of the LinkedHashSet as key and the values of the List as values in a Map and returns the Map.
	 */
	public Map listToMap(LinkedHashSet keyList, List valueList) {
		
		Map hashMap = new HashMap();
		
		if(isListsOfSameSize(keyList, valueList)) {
			
			if(isListNotNull(keyList) && isListNotEmpty(keyList) && isListNotNull(valueList) && isListNotEmpty(valueList)) {
					
				Iterator linkedHashSet = keyList.iterator();
					
				while (linkedHashSet.hasNext()) {
					
					for(int i = 0; linkedHashSet.hasNext(); i++) {
						hashMap.put(linkedHashSet.next(), valueList.get(i));
					}
					
				}
				
			} else {
				System.out.println("The lists are null or empty");
			}
			
		} else {
			System.out.println("The lists are not of same size. Please enter enter lists containg equal number of elements.");
		}
		return hashMap;
	}

}
