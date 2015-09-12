package com.company.MAX.week3;

import java.util.Scanner;

/**
 * Created by root on 12.09.15.
 */
public class Array_3_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int [] a = new int[3];
		int squareCicle = 0;
		System.out.print("Введите значения масива: ");

		for(int i = 0; i < a.length; i++) {
			squareCicle = scanner.nextInt();
			a[i] = squareCicle;
		}
		for(int i = 0; i < a.length; i++) {

			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
}
