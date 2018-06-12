package com.gmail.arsenycholexandra.homeWork2Level2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("Input number");
		a = sc.nextInt();

		if (a >= 1000 && a <= 9999) {
			int part1 = a / 1000;
			int part2 = a % 1000 / 100;
			int part3 = a % 1000 % 100 / 10;
			int part4 = a % 1000 % 100 % 10;

			if (part1 + part2 == part3 + part4) {
				System.out.println("Congratulations! Your ticket is lucky =)");

			}

			else {
				System.out.println("Sorry... Your ticket is not lucky =(");
			}
		} else {
			System.out.println("You entered wrong number");
		}

	}

}
