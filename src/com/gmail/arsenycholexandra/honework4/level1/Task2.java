package com.gmail.arsenycholexandra.honework4.level1;

import java.util.Scanner;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input massive length");
		int a = sc.nextInt();
		int b[] = new int[a];
		for (int i = 0; i < b.length; i++) {
			System.out.println("Input " + i + " element");
			b[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(b));
	}

}
