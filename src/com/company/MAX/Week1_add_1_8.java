package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 11.09.15.
 */
public class Week1_add_1_8 {
	public static void main(String[] args) {
		final int thousand = 1000;
		final double discont = 0.1;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите сумму покупки в грн(если больше 1000 скидка = 10%): ");

		double value_1 = scanner.nextDouble();

		if (value_1 >= thousand){

			double sumOfDiscont = value_1 * discont;

			System.out.printf("Скидка = %,.2f", sumOfDiscont);
		}else
			System.out.print("Нет скидки!");
	}
}
