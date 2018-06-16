package com.gmail.arsenycholexandra.homework3.level2;

import java.util.Collections;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("Input width (Odd number).");
		a = sc.nextInt();
		int x = a / 2;
		int space = 0;

		if (a % 2 == 0) {
			System.out.println("Your number is even. Input odd number");
		} else {
			for (int i = 1; i <= a; i++) {
				System.out.print(String.join("", Collections.nCopies(space, " ")));
				System.out.print(String.join("", Collections.nCopies((a - space * 2), "*")));
				
				if (x >= i) {
					space = i;
				}
				
				if (i > x) {
					space--;
				}
				
				System.out.println("");
			}

		}

		sc.close();

	}

}
