package com.gmail.arsenycholexandra.homework6.level1;

import java.util.Formatter;

public class Task4 {

	public static void main(String[] args) {
		
		for (int j = 2; j < 12; j++) {
			Formatter form = new Formatter();
			form.format("%." + j + "f", Math.PI);
			String text = form.toString();
			System.out.println(text);
		}

	}

}