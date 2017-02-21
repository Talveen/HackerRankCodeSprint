package com.wintal.universityCodeSprint2;

import java.util.Scanner;

public class Problem2 {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            int start=0; int end=1, i=0,counter=0;
	            while(i<s.length()){
	            	if(i<s.length()){
	            		int first=Integer.parseInt(s.substring(start, end+counter));
		            	int second=Integer.parseInt(s.substring(start+counter+1, end+counter*2+1));
		            	if((second-first)==1){
		            		System.out.println(second+" "+first);
		            	}
		            	counter=counter+1;
	            		i=i+1;
	            	}
	            	else{
	            		break;
	            	}
	            }
	            System.out.println(counter);
	        }
	    }
}
