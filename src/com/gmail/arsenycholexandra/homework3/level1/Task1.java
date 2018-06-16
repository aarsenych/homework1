package com.gmail.arsenycholexandra.homework3.level1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h;
		System.out.println("Input number of lines");
		h = sc.nextInt();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= h; j++) {
				if (j % 2 == 0) {
					System.out.print("***");
				} else {
					System.out.print("###");
				}
			}
			System.out.println("");
		}

	}

}
