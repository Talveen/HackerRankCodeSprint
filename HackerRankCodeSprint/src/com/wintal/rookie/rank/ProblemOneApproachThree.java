package com.wintal.rookie.rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProblemOneApproachThree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count=1;
        int n = in.nextInt();
        int n1=0,n2=0,n3=0,n4=0,n5=0;
        boolean flag=true;
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        for(int types_i=0; types_i < types.length; types_i++){
        	int k = map.get(types[types_i])==null?0:map.get(types[types_i]);
            map.put(types[types_i], k+1);
        }
        n1=map.get(1)==null?0:map.get(1);
        n2=map.get(2)==null?0:map.get(2);
        n3=map.get(3)==null?0:map.get(3);
        n4=map.get(4)==null?0:map.get(4);
        n5=map.get(5)==null?0:map.get(5);
        
        
        if(n1>n2 && n1>n3 && n1>n4 && n1>n5){
            System.out.println("1");
            flag=false;
        }
        else if(n2>n1 && n2>n3 && n2>n4 && n2>n5){
            System.out.println("2");
            flag=false;
        }
        else if(n3>n2 && n3>n1 && n3>n4 && n3>n5){
        	System.out.println("3");
            flag=false;
        }
        else if(n4>n2 && n4>n3 && n4>n1 && n4>n5){
        	System.out.println("4");
            flag=false;
        }
        else if(n5>n2 && n5>n3 && n5>n4 && n5>n1){
        	System.out.println("5");
            flag=false;
        }
        if(flag){
        if((n1==n2 || n1==n3 || n1==n4 || n1==n5))
        	System.out.println("1");
        else if((n2==n1 || n2==n3 || n2==n4 || n2==n5)  )
        	System.out.println("2");
        else if((n3==n2 || n3==n1 || n3==n4 || n3==n5))
        	System.out.println("3");
        else if((n4==n2 || n4==n3 || n4==n1 || n4==n5) )
        	System.out.println("4");
        else if((n5==n2 || n5==n3 || n5==n4 || n5==n1))
        	System.out.println("5");       
        }
        
    }
}
