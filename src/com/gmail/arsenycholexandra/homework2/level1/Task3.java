package com.gmail.arsenycholexandra.homework2.level1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year;
		System.out.println("Input year");
		year = sc.nextInt();
		
		int a = year % 4;
		int b = year % 400;
		int c = year % 100;
		
		if (b == 0 ) {
			
			System.out.println("It is 366 days in year");
			}
			
		else if (c != 0) {
				if (a == 0)
				System.out.println("It is 366 days in year");
			
		}
		
		else System.out.println("It is 365 days in year");
		
		
	}

}

