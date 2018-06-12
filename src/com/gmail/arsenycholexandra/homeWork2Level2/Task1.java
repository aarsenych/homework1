package com.gmail.arsenycholexandra.homeWork2Level2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r = 4.0;
		
		int x;
		System.out.println("Input x");
		x = sc.nextInt();
		
		int y;
		System.out.println("Input y");
		y = sc.nextInt();
		
		double s = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) );
		if (s < r) {
			System.out.println("This point is INside the circle");
		}
		
		else if (s == r) {
			System.out.println("This point is ON the circle");
		}
		
		else {
			System.out.println("This point is OUTside the circle");
		}
		
		sc.close();

	}

}
