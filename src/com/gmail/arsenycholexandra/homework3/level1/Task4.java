package com.gmail.arsenycholexandra.homework3.level1;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("Input heigth");
		a = sc.nextInt();

		int b;
		System.out.println("Input width");
		b = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (i == 1 || i == a) {
					System.out.print("*");
				} else if (j == 1 || j == b) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println(" ");
		}
		sc.close();

	}

}
