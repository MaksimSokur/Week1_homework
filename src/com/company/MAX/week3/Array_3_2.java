package com.company.MAX.week3;

import java.util.Scanner;

/**
 * Created by root on 12.09.15.
 */
public class Array_3_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] a = new int[2] ;

		System.out.print("Введите 2 значения масива: ");
		a[0] = scanner.nextInt();
		a[1] = scanner.nextInt();

		a[1] = a[0] + a[1];
		a[0] = a[1] - a[0];
		a[1] = a[1] - a[0];

		System.out.print(a[0]);
		System.out.print(" ");
		System.out.print(a[1]);


	}
}
