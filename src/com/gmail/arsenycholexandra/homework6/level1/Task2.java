package com.gmail.arsenycholexandra.homework6.level1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number in binary format:");
		String a = sc.nextLine();
		Integer i = Integer.parseInt(a, 2);
		System.out.println(a +" -> " + i);
	}

}

