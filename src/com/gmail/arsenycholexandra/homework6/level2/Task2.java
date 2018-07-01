package com.gmail.arsenycholexandra.homework6.level2;

public class Task2 {

	public static void main(String[] args) {
		int a = 17;
		int b = 117;
		
		String b1 = toBinaryString(a);
		String b2 = toBinaryString(b);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("Hamming distance is " + HammingDistance(b1, b2));

	}

	static String toBinaryString(int x) {
		return String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');

	}

	public static int HammingDistance(String One, String Two) {
		int counter = 0;
		for (int i = 0; i < One.length(); i++) {
			if (One.charAt(i) != Two.charAt(i))
				counter++;
		}
		return counter;
	}
}
