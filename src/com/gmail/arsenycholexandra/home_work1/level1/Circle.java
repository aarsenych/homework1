package com.gmail.arsenycholexandra;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input r");
		int r = sc.nextInt();
		double S = Math.PI * Math.pow(r, 2);
		System.out.println("S = " + S);
		
	}

}
