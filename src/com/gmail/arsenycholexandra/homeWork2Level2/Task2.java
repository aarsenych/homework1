package com.gmail.arsenycholexandra.homeWork2Level2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int xa = 0;
		int ya = 0;
		int xb = 4;
		int yb = 4;
		int xc = 6;
		int yc = 1;

		int x;
		System.out.println("Input x");
		x = sc.nextInt();
		
		int y;
		System.out.println("Input y");
		y = sc.nextInt();
		
		double a = (xa - x) * (yb - ya) - (xb - xa) * (ya - y);
		double b = (xb - x) * (yc - yb) - (xc - xb) * (yb - y);
		double c = (xc - x) * (ya - yc) - (xa - xc) * (yc - y);
		
		if ( a > 0 && b > 0 && c > 0) {
			
			System.out.println("Point is INside of the triangle");
		}
		
		else if ( a < 0 && b < 0 && c < 0) {
			
			System.out.println("Point is INside of the triangle");
		}
		
		else if ( a ==0 || b == 0 || c == 0) {
			
			System.out.println("Point is ON the triangle");
		}
		
		else {
			System.out.println("Point is OUTside the triangle");
		}
		
		sc.close();

	}

}
