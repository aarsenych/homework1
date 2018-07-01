package com.gmail.arsenycholexandra.homework6.level1;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		int [] a = {5, 8, 7, 10};
		System.out.println(toString(a));

	}
	public static String toString(int[] a) {
		String b = "["; 
		for (int i = 0; i < a.length; i++) {
			b = b + a[i];
			if (i != a.length - 1) {
				b += ", ";
			}
		}
		b += "]";
		
		return b;
		
	}
}
