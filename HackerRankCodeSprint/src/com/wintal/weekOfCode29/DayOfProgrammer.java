package com.wintal.weekOfCode29;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayOfProgrammer {

	 public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			int year = scanner.nextInt();
			int days=0;
			int day=0;
			if(year>=1700 && year<=1917){
				days=243;
				if((year%4)==0){
					days=days+1;
				}
				day=256-days;
			}
			else if(year==1918){
				days=229;
				if(((year%4)==0)||(year%4==0 && year%100!=0)){
					days=days+1;
				}
				day=256-days;
			}
			else if(year>1918){
				days=243;
				if(((year%4)==0)||(year%4==0 && year%100!=0)){
					days=days+1;
				}
				day=256-days;
			}
			GregorianCalendar gc = new GregorianCalendar();
			gc.set(Calendar.DAY_OF_MONTH, day); 
			gc.set(Calendar.MONTH, Calendar.SEPTEMBER); 
			gc.set(Calendar.YEAR, year);
			
			DateFormat df =  new SimpleDateFormat("dd.MM.yyyy");
			System.out.println(df.format(gc.getTime()));
		}

}
