package com.wintal.universityCodeSprint2;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] score = new int[n];
	        for(int score_i=0; score_i < n; score_i++){
	            score[score_i] = in.nextInt();
	        }
	        int max=score[0],min=score[0],countmax=0,countmin=0;
	        for(int i=1; i < score.length; i++){
	            if(score[i]>max){
	            	max=score[i];
	            	countmax=countmax+1;
	            }
	            else if(score[i]<min){
	            	min=score[i];
	            	countmin=countmin+1;
	            }
	        }
	        System.out.println(countmax+" "+countmin);

	}

}
