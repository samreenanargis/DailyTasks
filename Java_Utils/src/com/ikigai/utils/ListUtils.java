package com.ikigai.utils;

import java.util.LinkedHashSet;

public class ListUtils {
	
	/*
	 * This method accepts LinkedHashSet as argument and checks if it is null.
	 * If it is null, it returns false; else it returns true.
	 */
	public boolean isListNotNull(LinkedHashSet<String> list) {
		
		return (list != null) ? true : false;
	}

}
