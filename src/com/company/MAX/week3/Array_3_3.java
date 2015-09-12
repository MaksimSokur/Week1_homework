package com.company.MAX.week3;

import java.util.Scanner;

/**
 * Created by root on 12.09.15.
 */
public class Array_3_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] a = new int[5] ;

		for (int i = 0; i < a.length; i++) {
			System.out.printf("Введите значения масива №[%d] = ", i);
			a[i] = scanner.nextInt();
		}

		int min = a[0], max = a[0];
		for (int i : a){
			if (max < i) max = i;
			if (min > i) min = i;
		}
		System.out.printf("Максимальное значение масива %d \n", max);
		System.out.printf("Минимальное значение масива %d \n", min);

	}
}
