package com.gmail.arsenycholexandra.homework2.level1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int apartmentNumber;
		System.out.println("Input apartment number");
		apartmentNumber = sc.nextInt() - 1;
		
		if (apartmentNumber > 143 || apartmentNumber < 0) {
			System.out.println("Wrong apt number");
		} else {
			int entrance = apartmentNumber / 36 + 1;
			int floor = apartmentNumber % 36 / 4 + 1;
			
			System.out.println("Entrance number " + entrance);
			System.out.println("Floor number " + floor);
		}
		
		sc.close();
	}

}
