package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 11.09.15.
 */
public class Week1_add_1_11 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите количество монет: ");

		int valuta = scanner.nextInt();

		{
			if (valuta >= 10 && valuta <= 20) {
				System.out.printf("%d копеек", valuta);
			}
			else
			{
				sum = valuta % 10;
			if (sum == 1) {
				System.out.printf("%d копейка", valuta);
			}else if (sum == 2 || sum == 3 || sum == 4 || sum == 0) {
				System.out.printf("%d копейки", valuta);
			}else if (sum >= 5 || sum <= 9) {
				System.out.printf("%d копеек", valuta);
			}
		}
	}
}
}