package com.gmail.arsenycholexandra.home_work1.level1;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input r");
		double r = sc.nextDouble();
		double S = Math.PI * Math.pow(r, 2);
		System.out.println("S = " + S);
		sc.close();
		
	}

}
