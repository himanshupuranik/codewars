/**
 * 
 */
package com.codewars.himanshu.puranik;

/**
 * Created on: 16/01/2019
 * @author Himanshu Puranik
 * Kata Name: DubStep
 * Kata Level = 6 KYU
 */
public class DubStep {
	public static String SongDecoder (String song)
	  {
	    String dubSong = song; //Assiging the passed string to a new string
	    String theSong = dubSong.replace("WUB", " ");    //Replacing all "WUB" characters to a space character
	    theSong = theSong.trim(); //Trimming the string to remove spaces at the start and at the end of the string
	    theSong = theSong.replaceAll("(\\s){1,200}", " "); //Using regex to remove extra spaces between characters with limit 1 to 200
	    return theSong;
	   }
}
