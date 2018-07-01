package com.gmail.arsenycholexandra.homework6.level1;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		Calendar monthAgo = Calendar.getInstance();
		monthAgo.set(Calendar.MONTH, today.get(Calendar.MONTH) - 1);
		long difference = today.getTimeInMillis() - monthAgo.getTimeInMillis();
		System.out.println("There are "  + difference + " miliseconds from previous month.");
	}

}
