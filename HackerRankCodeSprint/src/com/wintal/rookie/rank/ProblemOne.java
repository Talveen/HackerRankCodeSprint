package com.wintal.rookie.rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProblemOne{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1=0,n2=0,n3=0,n4=0,n5=0; 
        boolean flag=true;
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        for(int types_i=0; types_i < n; types_i++){
            if(types[types_i] ==1)
                n1=n1+1;
            if(types[types_i] ==2)
                n2=n2+1;
            if(types[types_i] ==3)
                n3=n3+1;
            if(types[types_i] ==4)
                n4=n4+1;
            if(types[types_i] ==5)
                n5=n5+1;
        }
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
        if((n1==n2 || n1==n3 || n1==n4 || n1==n5) && flag )
        	System.out.println("1");
        else if((n2==n1 || n2==n3 || n2==n4 || n2==n5) && flag )
        	System.out.println("2");
        else if((n3==n2 || n3==n1 || n3==n4 || n3==n5) && flag )
        	System.out.println("3");
        else if((n4==n2 || n4==n3 || n4==n1 || n4==n5 )&& flag )
        	System.out.println("4");
        else if((n5==n2 || n5==n3 || n5==n4 || n5==n1) && flag )
        	System.out.println("5");
       
        }
     
}




/*


A flock of birds is flying across the continent. Each bird has a type, and the different types are designated by the ID numbers , , , , and .

Given an array of integers where each integer describes the type of a bird in the flock, find and print the type number of the most common bird. If two or more types of birds are equally common, choose the type with the smallest ID number.

Input Format

The first line contains an integer denoting (the number of birds).
The second line contains space-separated integers describing the respective type numbers of each bird in the flock.

Constraints

    It is guaranteed that each type is , , , , or .

Output Format

Print the type number of the most common bird; if two or more types of birds are equally common, choose the type with the smallest ID number.


*/