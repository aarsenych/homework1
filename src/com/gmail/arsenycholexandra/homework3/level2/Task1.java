package com.gmail.arsenycholexandra.homework3.level2;

import java.util.Collections;

public class Task1 {

	public static void main(String[] args) {
		int width = 4;
		int height = 2 * width -1;
		int j = 1;
		
		for (int i = 1; i <= height; j++ ) {
				System.out.print("*");
				if (( i < width && j >= i ) || (i >= width && j > height - i)) {
					System.out.println("");
					i++;
					j = 0;
				}
		}
	}
}
