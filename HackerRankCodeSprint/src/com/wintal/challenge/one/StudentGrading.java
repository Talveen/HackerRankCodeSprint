package com.wintal.challenge.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGrading {

	public static void main(String[] args) {
		
		List<Integer> gradeList =  new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			int k = scanner.nextInt();
			if((k%5)>=3 && k>=38)
				k+=(5-(k%5));
			gradeList.add(k);
		}
		for(int i = 0; i<gradeList.size();i++){
			System.out.println(gradeList.get(i));
		}
		
	}
}
