package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 11.09.15.
 */
public class Week1_add_1_13 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите три значения: ");

		int value_1 = scanner.nextInt();
		int value_2 = scanner.nextInt();
		int value_3 = scanner.nextInt();

		int sum = value_1 + value_2 + value_3;

		if (sum > 0){
			value_1 = value_1 * value_1;
			value_2 = value_2 * value_2;
			value_3 = value_3 * value_3;
			System.out.printf("%d\n",value_1);
			System.out.printf("%d\n", value_2);
			System.out.printf("%d\n",value_3);
		}else if (sum <= 0){
			value_1 = value_2 = value_3 = 0;
			System.out.print(0);
		}
	}
}
