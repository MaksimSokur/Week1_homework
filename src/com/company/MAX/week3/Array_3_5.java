package com.company.MAX.week3;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by root on 12.09.15.
 */
public class Array_3_5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] array_1 = new int[5];
		int[] array_2 = new int[5];


		for (int i = 0; i < array_1.length; i++) {
			System.out.printf("Введите значения первого масива №[%d] = ", i);
			array_1[i] = scanner.nextInt();
		}
		for (int i = 0; i < array_2.length; i++) {
			System.out.printf("Введите значения второго масива №[%d] = ", i);
			array_2[i] = scanner.nextInt();
		}
		array_2 = Arrays.copyOf(array_1,array_1.length);

		System.out.print(Arrays.toString(array_2));

	}

}
