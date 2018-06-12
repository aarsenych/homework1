package com.gmail.arsenycholexandra.homework2.level1;

import java.util.Scanner;

public class Task4 {

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
		
		int d = a + b;
		int e = a + c;
		int f = b + c;
		
		
		if (d > c && e > b && f > a) {
			System.out.println("Triangle exists");
		}
		
		else {
			System.out.println("Triangle doesn`t exist");
		}
		

	}

}
