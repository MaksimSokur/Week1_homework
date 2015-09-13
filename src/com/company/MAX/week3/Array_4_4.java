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
		arrayChange(array, value);
		PrintArray(array);
	}


	public static void arrayChange(int value[], int position) {
		int arrayTemp[] = new int[5];
		System.arraycopy(value, position, arrayTemp, 0, value.length - position);
		System.arraycopy(value, 0, arrayTemp, arrayTemp.length - position, position);
		System.arraycopy(arrayTemp, 0, value, 0, arrayTemp.length);

	}

	private static void PrintArray(int[] array) {
		System.out.print(Arrays.toString(array));
	}
}