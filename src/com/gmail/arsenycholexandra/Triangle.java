package com.gmail.arsenycholexandra;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
		int c = 5;
		double p = (a + b + c) / 2;
		double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println(S);
		
	}

}
