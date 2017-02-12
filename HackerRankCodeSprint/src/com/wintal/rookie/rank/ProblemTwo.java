package com.wintal.rookie.rank;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemTwo {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int minDiff = a[1]-a[0];
        for (int i = 2 ; i != a.length ; i++) {
            minDiff = Math.min(minDiff, a[i]-a[i-1]);
        }
        System.out.println(minDiff);
	}
}





/*


Consider an array of integers, . We define the absolute difference between two elements, and (where ), to be the absolute value of .

Given an array of integers, find and print the minimum absolute difference between any two elements in the array.

Input Format

The first line contains a single integer denoting (the number of integers).
The second line contains space-separated integers describing the respective values of .

Constraints

Output Format

Print the minimum absolute difference between any two elements in the array.

*/