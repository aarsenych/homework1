package com.gmail.arsenycholexandra.homework2.level1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.println("Input a");
		a = sc.nextInt();
		
		int b;
		System.out.println("Input b");
		b = sc.nextInt();
		
		int c;
		System.out.println("Input c");
		c = sc.nextInt();
		
		int d;
		System.out.println("Input c");
		d = sc.nextInt();
		
		int max = a;
		if (b > max) {
			max = b;
		}
		
		if (c > max) {
			max = c;
		}
		
		if (d > max) {
			max = d;
		}
		
		System.out.println(" Max number = " + max);
			
	 sc.close();
	}

}
