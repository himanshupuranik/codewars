/**
 * 
 */
package com.codewars.himanshu.puranik;

/**
 * Created on: 16/01/2019
 * @author Himanshu Puranik
 * Kata Name: A Needle In The Haystack
 * Kata level = 8 KYU
 */
public class ANeedleInTheHaystack {
	 public static String findNeedle(Object[] haystack) {
		    int length = haystack.length;
		    int position = 0;
		    for(int i = 0; i < length; i++){
		      if(haystack[i] == "needle"){
		        position = i ;
		      }
		    }
		    return "found the needle at position " + position;
		  }
}
