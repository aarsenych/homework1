package com.gmail.arsenycholexandra.homework3.level2;

import java.util.Collections;

public class Task1 {

	public static void main(String[] args) {
		int width = 4;
		int height = 2 * width -1;
		
		for (int i = 1; i <= height; i++ ) {
			if ( i <= width) {
				System.out.print(String.join("", Collections.nCopies(i, "*")));
			}
			if ( i > width ) {
				System.out.print(String.join("", Collections.nCopies(height + 1 - i, "*")));
			}
			System.out.println("");
		}
	}
}
