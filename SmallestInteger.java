/**
 * 
 */
package com.codewars.himanshu.puranik;

import java.util.Arrays;

/**
 * Created on: 16/01/2019
 * @author Himanshu Puranik
 * Kata Name: Find the smallest integer in the array
 * Kata Level = 8 KYU
 */
public class SmallestInteger {
	public static int findSmallestInt(int[] args) {
	      Arrays.sort(args); return args[0];      
	    }
}
