package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 11.09.15.
 */
public class Week1_add_1_14 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите шестизначное число: ");

		int value = scanner.nextInt();

		int sum_1 = value % 10;

		value = value / 10;

		int sum_2 = value % 10;

		value = value / 10;

		int sum_3 = value % 10;

		value = value / 10;

		int sum_4 = value % 10;

		value = value / 10;

		int sum_5 = value % 10;

		value = value / 10;

		int sum_6 = value % 10;

		int lukyOne = sum_1 + sum_2 + sum_3;
		int lukyTwo = sum_4 + sum_5 + sum_6;
		if (lukyOne == lukyTwo){
			System.out.print("Число счастливое!!!");
		}else
			System.out.print("Число не счастливое!!!");
	}
}
