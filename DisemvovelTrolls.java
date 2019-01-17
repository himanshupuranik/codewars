/**
 * 
 */
package com.codewars.himanshu.puranik;
/**
 * Created on: 16/01/2019
 * @author Himanshu Puranik
 * Kata Name: Disemvovel Trolls
 * Kata Level = 7 KYU
 */
public class DisemvovelTrolls {
	public static String disemvowel(String str) {
	      return str.replaceAll("(a|e|i|o|u|A|E|I|O|U)", ""); //Simple regex to remove both upper and lower cased vowels
	    }
}
