/**
 * 
 */
package com.codewars.himanshu.puranik;

/**
 *  Created on: 16/01/2019
 * @author Himanshu Puranik
 * Kata Name: Take a Ten Minute Walk
 * Kata Level = 6 KYU
 */
public class TenMinuteWalk {
	public static boolean isValid(char[] walk) {
	    if(walk.length > 10 || walk.length < 10) { return false; }
	    int north = 0; int south = 0; int east = 0; int west = 0;
	    for(char i : walk){
	      if(i == 'n'){
	        north += 1; 
	        }
	      else if(i == 's'){
	        south += 1;
	        } 
	      else if(i == 'e'){
	        east += 1;
	        }  
	      else if(i == 'w'){
	        west += 1;
	        }  
	    }
	    return (north == south) && (east == west);
	  }
}
