package com.company.MAX.week3;

import java.util.Arrays;

/**
 * Created by root on 13.09.15.
 */
public class Array_3_11 {
	public static void main(String[] args) {
		final int lenght = 5;

		int[] array1 = new int[lenght];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (8 + Math.random() * 73);
		}
		System.out.print(Arrays.toString(array1));
		int[] array2 = new int[lenght];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) (8 + Math.random() * 73);
		}
		System.out.print(Arrays.toString(array2));

		int a1 = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
				a1++;
			}
		}
		int a2 = 0;
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] % 2 == 0) {
				a2++;
			}
		}
		if (a1 > a2) {
			System.out.println("\nразмерность Трико в масиве № 1 = " + a1 + " больше чем в масиве №2");
		} else if (a1 < a2) {
			System.out.println("\nразмерность Трико в масиве № 2 = " + a2 + " больше чем в масиве №1 ");
		} else if (a1 == a2) {
			System.out.println("\nразмерность Трико в масиве № 1 == масиве №2");

		}

	}
}