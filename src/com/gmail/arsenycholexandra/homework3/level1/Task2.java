package com.gmail.arsenycholexandra.homework3.level1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		
		System.out.println("Input number n");
		n = sc.nextInt();
		if (n > 4 && n < 16) {
			for (int i = n - 1; i >= 1; i--) {
				n = i * n;
			}
			System.out.println(n);
		} else
			System.out.println("You entered wrong number");

		sc.close();

	}

}
