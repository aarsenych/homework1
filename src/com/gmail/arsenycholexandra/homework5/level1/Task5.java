package com.gmail.arsenycholexandra.homework5.level1;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string");
		String a = sc.nextLine();
		System.out.println("There are "+ returnWords(a) + " words in your string");
	}
	
	public static int returnWords(String a) {
		int count = 0;
		char [] myCharArray = a.toCharArray ();

		if (a.length() != 0 ) {
			count++;
		}
		
		for (int i = 0; i < a.length(); i++ ) {
			if (myCharArray[i] == ' ') {
				count++;
			}
		}
		return count;
	}

}
