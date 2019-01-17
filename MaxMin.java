package com.codewars.himanshu.puranik;

/**
 * Created on: 16/01/2019
 * @author Himanshu Puranik
 * Kata Name: Find Maximum and Minimum Values of a List
 * Kata Level = 8 KYU
 */
import java.util.Arrays;

public class MaxMin {
	public int min(int[] list) {
	    Arrays.sort(list);
	    return list[0];
	  }
	  
	  public int max(int[] list) {
	   Arrays.sort(list);
	   int listSize = list.length;
	   return list[listSize - 1];
	  }
}
