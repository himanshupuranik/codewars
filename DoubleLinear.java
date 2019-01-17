package com.codewars.himanshu.puranik;

/**
 * Created on: 17/01/2019
 * @author Himanshu Puranik
 * Kata Name: Double Linear
 * Kata level = 4 KYU
 */

import java.util.SortedSet;
import java.util.TreeSet;
class DoubleLinear {
    
    	public static int dblLinear(int n) {
        if (n == 0) return 1;
        SortedSet<Integer> u = new TreeSet<>(); // Create a sorted set
        u.add(1);
        for (int i = 0; i < n; i++) {
            int x = u.first();
            u.add(x * 2 + 1);
            u.add(x * 3 + 1);
            u.remove(x); // Remove the first element added. Thus the size of set would be equal or less than the n value. 
        }
        return u.first(); //
}
}
