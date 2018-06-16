package com.gmail.arsenycholexandra.homework3.level2;

public class Task2 {

	public static void main(String[] args) {
		int s = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
				 	s = 1;
				 	break;
				}
						
			}
			
			if (s != 1) {
				System.out.println(i);
			}
			
			s = 0;
		}

	}

}
