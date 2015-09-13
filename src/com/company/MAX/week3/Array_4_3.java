package com.company.MAX.week3;

import java.util.Random;

/**
 * Created by root on 13.09.15.
 */
public class Array_4_3 {
	public static void main(String[] args) {
		int value, chislo;
		Random random = new Random();

		value = random.nextInt(10000);
		chislo = random.nextInt(5555);
		System.out.print(delenie(value, chislo));
	}

	public static int delenie(int a, int b) {
		return (b == 0) ? a : delenie(b, a % b);
	}
}
