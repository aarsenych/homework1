package com.gmail.arsenycholexandra.homework5.level1;

import java.util.Scanner; 

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array length");
		int n = sc.nextInt();
		int b[] = new int[n];
		for (int i = 0; i < b.length; i++) {
			System.out.println("Input " + i + " element");
			b[i] = sc.nextInt();
		}
		System.out.println(maxNumber(b));
		sc.close();
	}
	public static int maxNumber(int a[]) {
		int max = a[0];
		for (int j = 0; j < a.length; j++) {
			if (a[j] > max) {
				max = a[j];
			}			
		} 	
		return max;
	}
}
