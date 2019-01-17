/**
 * 
 */
package com.codewars.himanshu.puranik;

/**
 * Created on: 16/01/2019
 * @author Himanshu Puranik
 * Kata Name: Exes and Os
 * Kata Level = 7 KYU
 */
public class XO {
	 public static boolean getXO (String str) {
		   str = str.toLowerCase();
		   int strLength = str.length();
		   int totalX = 0; int totalO = 0;
		   for(int i = 0; i < strLength; i++){
		     if(str.charAt(i) == 'x'){
		       totalX += 1; 
		     }
		     else if(str.charAt(i) == 'o'){
		       totalO += 1;
		     }
		   }
		   return((totalX == totalO));
		   }
}
