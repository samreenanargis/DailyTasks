package com.ikigai.utils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		ListUtils listUtils = new ListUtils();
		
		LinkedHashSet keyList = new LinkedHashSet();
		List valueList = new ArrayList();
		
		keyList.add("Prav");
		keyList.add("Rav");
		
		valueList.add("Sam");
		valueList.add("Nar");
		
		
		
		System.out.println(listUtils.listToMap(keyList, valueList));
		//System.out.println(listUtils.isListsOfSameSize(keyList, valueList));

	}

}
