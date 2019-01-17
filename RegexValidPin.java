/**
 * 
 */
package com.codewars.himanshu.puranik;

import java.util.regex.Pattern;

/**
 * Created on: 16/01/2019
 * @author Himanshu Puranik
 * Kata Name: Regex Valid PIN Code
 * Kata Level = 7 KYU
 */
public class RegexValidPin {
	public static boolean validatePin(String pin) {
	    if(Pattern.matches("[\\d]{4}", pin) || Pattern.matches("[\\d]{6}", pin)){    // a simple if statement to check for required pattern
	    return true;
	    }
	    else{
	    return false;
	    }
	  }
}
