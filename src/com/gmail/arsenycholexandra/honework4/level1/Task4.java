package com.gmail.arsenycholexandra.honework4.level1;

import java.util.Scanner;

import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input word:");
		String a = sc.nextLine();
		char t[] = a.toCharArray();

		for (int i = 0; i < t.length; i++) {
			if (t[i] == 'b') {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
