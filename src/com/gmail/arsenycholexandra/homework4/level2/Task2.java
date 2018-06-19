package com.gmail.arsenycholexandra.homework4.level2;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		int[] arr = new int[] {4, 8, 10, 5};
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[arr.length - i - 1];	
		}
		System.out.println(Arrays.toString(arr1));
	}

}
