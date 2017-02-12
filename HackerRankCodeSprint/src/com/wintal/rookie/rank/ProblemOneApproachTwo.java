package com.wintal.rookie.rank;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemOneApproachTwo {
	static int maxRepeating(int arr[], int n, int k)
    {
        for (int i = 0; i< n; i++)
            arr[(arr[i]%k)] += k;
 
        int max = arr[0], result = 0;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                result = i;
            }
        }
        return result;
    }
 
    public static void main (String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
        int arr[] = new int[n];
        for(int types_i=0; types_i < n; types_i++){
        	arr[types_i] = in.nextInt();
        }
        int k=n;
        System.out.println("Maximum repeating element is: " +
                           maxRepeating(arr,n,k));
    }
}	

