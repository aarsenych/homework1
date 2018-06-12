package com.gmail.arsenycholexandra.homeWork2Level2;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("Input six digit number");
		a = sc.nextInt();

		if (a >= 100000 && a <= 999999) {
			int part1 = a / 100000;
			int part2 = a % 100000 / 10000;
			int part3 = a % 100000 % 10000 / 1000;
			int part4 = a % 100000 % 10000 % 1000 / 100;
			int part5 = a % 100000 % 10000 % 1000 % 100 / 10;
			int part6 = a % 100000 % 10000 % 1000 % 100 % 10;
				
				if (part1 == part6 && part2 == part5 && part3 == part4 ) {
					System.out.println("Your number is palindrome! ");
				}
				
				else {
					System.out.println("It is not palindrome =(");
						
		}
				}
		else {
			System.out.println("You entered wrong number");
		}
		}
	}



