package com.codewars.himanshu.puranik;
/**
 * Created on: 16/01/2019
 * @author Himanshu Puranik
 * Kata Name: Isogram
 * Kata Level = 7 KYU
 */
public class Isogram {
	public static boolean  isIsogram(String str) {
        String lowerCasedString = str.toLowerCase(); 
	       int stringLength = lowerCasedString.length();         
	       for(int i = 0; i<=stringLength; i++){
	         for(int j = i + 1; j < stringLength; j++){
	           if(lowerCasedString.charAt(i) == lowerCasedString.charAt(j)){
	              return false;
	             }
	         }
	       }
	       return true;
	    }
}
