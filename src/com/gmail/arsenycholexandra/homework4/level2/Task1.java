package com.gmail.arsenycholexandra.homework4.level2;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		int l = 5;
		int k = 180;
		int [] [] a = new int[l][l];
		// Default array for comparison 
		for (int i = 1; i <= a.length; i++) {
			System.out.print('[');
			for (int j = 1; j <= a.length; j++) {
				System.out.print(j);
				if (j != a.length) {
					System.out.print(',');
				}
			}
			System.out.println(']');
		}
		System.out.println("");
		
		for (int i = 1; i <= a.length; i++) {
			System.out.print('[');
			for (int j = 1; j <= a.length; j++) {
				switch (k) {
					case 90:
						System.out.print(i);
						break;
					case 180:
						System.out.print(l + 1 - j);
						break;
					case 270:
						System.out.print(l + 1 - i);
						break;
					default:
						System.out.print(j);
				}
				if (j != a.length) {
					System.out.print(',');
				}
			}
			System.out.println(']');
		}
	}

}
