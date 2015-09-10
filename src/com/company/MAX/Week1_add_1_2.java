package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 10.09.15.
 */
public class Week1_add_1_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter three value: ");

		double value_1 = scanner.nextDouble();
		double value_2 = scanner.nextDouble();
		double value_3 = scanner.nextDouble();

		if (value_1 > 0) {
			double sum_1 = value_1 * value_1 * value_1;
			System.out.print("\nКуб из первого значения = ");
			System.out.print(sum_1);
		}
		if (value_2 > 0 ) {
			double sum_2 = value_2 * value_2 * value_2;
			System.out.print("\nКуб из второго значения = ");
			System.out.print(sum_2);
		}
		if (value_3 > 0) {
			double sum_3 = value_3 * value_3 * value_3;
			System.out.print("\nКуб из третего значения = ");
			System.out.print(sum_3);
		}
		if (value_1 <= 0) {
			System.out.print("Значение 1 = ");
			System.out.print(value_1 = 0);
		}
		if (value_2 <= 0) {
			System.out.print("\nЗначение 2 = ");
			System.out.print(value_2 = 0);
		}
		if (value_3 <= 0) {
			System.out.print("\nЗначение 3 = ");
			System.out.print(value_3 = 0);
		}

	}
}