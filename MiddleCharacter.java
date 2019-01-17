/**
 * 
 */
package com.codewars.himanshu.puranik;

/**
 * Created on: 17/01/2019
 * @author Himanshu Puranik
 * Kata Name: Get the Middle Character
 * Kata Level = 7 KYU
 */
public class MiddleCharacter {
	public static String getMiddle(String word) {		
	    int size = word.length();
	    System.out.println(size);
	    if((size % 2) == 0){
	     int mid = size/2;
	     char a = word.charAt(mid - 1); char b = word.charAt(mid);
	     return String.valueOf(a) + String.valueOf(b);
	    }
	    else {
	    	return String.valueOf(word.charAt(size/2));
	    }
	  }
}
