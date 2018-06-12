package com.gmail.arsenycholexandra;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Input number");
		number = sc.nextInt();
		int part1 = number / 10000;
		int part2 = number % 10000 / 1000;
		int part3 = number % 10000 % 1000 / 100;
		int part4 = number % 10000 % 1000 % 100 / 10;
		int part5 = number % 10000 % 1000 % 100 % 10;
		System.out.println(part1);
		System.out.println(part2);
		System.out.println(part3);
		System.out.println(part4);
		System.out.println(part5);

	}

}
