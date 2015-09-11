package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 11.09.15.
 */
public class Week1_add_1_10 {
	public static void main(String[] args) {
		final double InMinute = 1.25;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите время разговора: ");

		float prodolzitelnostRazgovora = scanner.nextFloat();

		System.out.print("Введите день недели: ");

		int dayOfWeek = scanner.nextInt();
		double payWeekday = prodolzitelnostRazgovora * InMinute;
		double payHollyday = payWeekday - (payWeekday * 0.2);
		double deposit = payWeekday * 0.2;
		if (dayOfWeek == 6 || dayOfWeek == 7)
		{
			System.out.printf("C вас (со скидкой 20 %%:) %,.2f", payHollyday);
			System.out.printf("\nСкидка 20 %%:) %,.2f", deposit);
		}else if (dayOfWeek >= 1 || dayOfWeek <= 5){

			System.out.printf("C вас: %,.2f", payWeekday);
		}

	}
}
