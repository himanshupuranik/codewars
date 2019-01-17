/**
 * 
 */
package com.codewars.himanshu.puranik;

/**
 * Created on: 16/01/2019
 * @author Himanshu Puranik
 * Kata name: Find the next perfect square!
 * Kata Level = 7 KYU
 */
public class NextPerfectSquare {
	public static long findNextSquare(long sq) {
	      if(Math.sqrt(sq) != (int)Math.sqrt(sq)) { return -1; }
	      long nextNumber = sq + 1; 
	      while(Math.sqrt(nextNumber) != (int)Math.sqrt(nextNumber)){
	        nextNumber += 1;
	       }
	       return nextNumber;
	  }
}
