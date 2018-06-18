package com.gmail.arsenycholexandra.honework4.level1;

import java.util.Random;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		Random rn = new Random();
		int[] arr1 = new int[15];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rn.nextInt(10000);
		}

		int[] arr2 = new int[30];
		for (int i = 0; i < arr2.length; i++) {
			if (i < 15) {
				arr2[i] = arr1[i];
			} else {
				arr2[i] = 2 * arr1[i - 15];
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
