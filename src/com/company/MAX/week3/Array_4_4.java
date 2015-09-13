package com.company.MAX.week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by root on 13.09.15.
 */
public class Array_4_4 {
	public static void main(String[] args) {
		int value, array[] = {1, 2, 3, 4, 5};

		System.out.print(Arrays.toString(array));
		Scanner scanner = new Scanner(System.in);

		System.out.print("\nВведите число (1 - 5) на сколько стоит сдвинуть массив: ");

		value = scanner.nextInt();
		System.out.println(arrayChange(value));
	}

	public static int[] arrayChange(int value) {

		int [] arrayCopy = new int[value];
		for (int i = 0; i < arrayCopy.length; i++) {
			arrayCopy[i]++;
		}
		return arrayCopy;

	}

	}
