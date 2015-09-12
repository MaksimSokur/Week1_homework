package com.company.MAX.week3;

import java.util.Random;

/**
 * Created by root on 12.09.15.
 */
public class Array_3_7 {
	public static void main(String[] args) {


		int[] a = new int[5];

		Random random = new Random();

		for (int i = 0; i < a.length; i++) {

			a[i] = random.nextInt(10);
			System.out.printf("Случайное значения масива №[%d] = ", i);
			System.out.printf("%d \n", a[i]);
		}
		int min = a[0], max = a[0];
		for (int i : a){
			if (max < i) max = i;
			if (min > i) min = i;
		}
		System.out.printf("Максимальное значение масива %d \n", max);
		System.out.printf("Минимальное значение масива %d \n", min);

		int change = max;
		max = min;
		min = change;

		System.out.printf("После замены %d , ", max);
		System.out.printf("%d", min);
	}
}
