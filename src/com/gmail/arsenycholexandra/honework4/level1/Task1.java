package com.gmail.arsenycholexandra.honework4.level1;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		int[] a = new int[] {0, 5, 2, 4, 7, 1, 3, 19};
		int count = 0;
		 for (int i = 0; i < a.length; i++) {
			 if(a[i] % 2 != 0) {
				 count += 1;	 
			 }	
		}
		 System.out.println("There are " + count + " odd numbers.");
	}

}
