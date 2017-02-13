package com.wintal.java.daily;

import java.util.Scanner;

public class Recurssion {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = fact(n);
		System.out.println(sum);
	}
	
	public static int fact(int n){
		if(n==0)
			return 1;
		else 
			return(n*fact(n-1));
	}
	
} 

