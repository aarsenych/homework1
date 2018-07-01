package com.gmail.arsenycholexandra.homework5.level2;

import java.util.Scanner;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		int [] b = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(b));
	}
	
	public static int[] makeCombinations(int[] array) {
		int b = array.length;
		for (int i = 0; i < b; i++) {
			for (int j = i + 1; j <= b; j++) {
				j++;
			}
			i++;
		}
		return array;
	}


	}
	


