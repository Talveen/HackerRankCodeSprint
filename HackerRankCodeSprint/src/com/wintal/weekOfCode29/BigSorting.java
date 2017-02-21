package com.wintal.weekOfCode29;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        BigInteger[] numbers = new BigInteger[unsorted.length];
        for(int i = 0;i < unsorted.length;i++)
        {
           numbers[i] = new BigInteger(unsorted[i]);
        }
        Arrays.sort(numbers);
        for(int i = 0;i<n;i++){
        	System.out.println(numbers[i]);
        }
    }

}
