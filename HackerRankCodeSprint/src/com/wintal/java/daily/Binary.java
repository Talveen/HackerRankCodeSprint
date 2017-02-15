package com.wintal.java.daily;

import java.util.Scanner;

//Daily Challenge-Day10
public class Binary {
	   public static void main(String[] args) {
			Scanner scanner =  new Scanner(System.in);
			String bin = "";
			int n = scanner.nextInt();
			while(n!=0||n!=1){
				if(n==0||n==1){
					bin=bin+n;
					break;
				}
					
				bin=bin+(n%2);
				n=n/2;
			}
			
			StringBuilder builder = new StringBuilder();
			builder.append(bin);
			String binRev=builder.reverse().toString();
			int[] a = new int[binRev.length()];
			for(int i=0;i<binRev.length();i++){
				a[i]=Character.getNumericValue(binRev.charAt(bin.length()-i-1));
			}
			int count=0;int maxLength = 0;
			for(int i =0;i<a.length;i++){
				if (a[i] == 1) {
					count++;
	            } else {
	            	count = 0;
	            }

	            if (count > maxLength) {
	                maxLength = count;
	            }
				}
			System.out.println(maxLength);
		}
}
