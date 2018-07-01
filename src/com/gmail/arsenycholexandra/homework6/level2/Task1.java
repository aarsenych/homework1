package com.gmail.arsenycholexandra.homework6.level2;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
		String dateText = "";
		System.out.println("Input date in format dd:MM:yyyy");
		dateText = sc.nextLine();
		Calendar today = Calendar.getInstance();
		String timeStamp = new SimpleDateFormat("dd:MM:yyyy").format(Calendar.getInstance().getTime());
		
		Date d1 = null;
		Date d2 = null;
		try {
		    d1 = sdf.parse(dateText);
		    d2 = sdf.parse(timeStamp);
		} catch (ParseException e) {
		    e.printStackTrace();
		}    

		long diff = d2.getTime() - d1.getTime(); 
		long diffDays = diff / (24 * 60 * 60 * 1000); 
		long diffMonths = diff / (24 * 30 * 60 * 60 * 1000); 
		long diffYears = diff / (24 * 30 * 60 * 60 * 1000 * 365); 
		
		System.out.println("The difference between your and system date is  " + Math.abs(diffDays) + " days, " + Math.abs(diffMonths) + " months and " + Math.abs(diffYears) + " years.");         
		
	}

}
