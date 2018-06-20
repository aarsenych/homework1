package com.gmail.arsenycholexandra.homework5.level1;

public class Task4 {

	public static void main(String[] args) {
		int[] b = {5, 5, 8, 6};
		System.out.println(seekForElement(8, b));
	}
	public static int seekForElement(int b, int[] a) {
		int test = 0;
		for (int j = 0; j < a.length; j++) {
			if (a[j] == b) {
				test = j;
				break;
			} else {
				test = -1;
			}
		}
		return test;
	}
}
