package com.wintal.codesprint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WeightedUniformString {
	public static void main(String args[]){
		Map<String, Integer> keyWeight = new HashMap<String, Integer>();
		Map<String, Integer> uniformSub = new HashMap<String, Integer>();
		int count=1;
		for (int i = 97; i <= 122; i++) {
			keyWeight.put(Character.toString((char) i), i-96);
		}
		Scanner scanner = new Scanner(System.in);
		String seq =  scanner.next();
		String contSeq= Character.toString(seq.charAt(0));
		uniformSub.put(contSeq, keyWeight.get(contSeq));
		for(int i=1; i<seq.length(); i++){
			if(seq.charAt(i)==seq.charAt(i-1)){	
				contSeq= contSeq+seq.charAt(i);
				count=count+1;
				String ss=Character.toString(seq.charAt(i));
				uniformSub.put(contSeq, keyWeight.get(ss)*count);
			}
			else{
				contSeq=Character.toString(seq.charAt(i));
				uniformSub.put(contSeq, keyWeight.get(contSeq));
				count=1;
			}
				
		}
		int limit =  scanner.nextInt();
		for(int i = 0; i<limit;i++){
			int query = scanner.nextInt();
			if(uniformSub.containsValue(query))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
