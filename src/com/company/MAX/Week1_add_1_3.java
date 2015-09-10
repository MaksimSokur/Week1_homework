package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 10.09.15.
 */
public class Week1_add_1_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value: ");

		int value = scanner.nextInt();

			int sum_1 = value % 10;

			value = value / 10;

			int sum_2 = value % 10;

			value = value / 10;

			int sum_3 = value % 10;
			if(sum_1 == sum_2 && sum_1 == sum_3 && sum_2 == sum_3) {
				System.out.print("Все цыфры одинаковые");
			}else if (sum_1 == sum_2 || sum_1 == sum_3 || sum_2 == sum_3) {
				System.out.print("Есть одинаовые цыфры");
			}

		}
	}
