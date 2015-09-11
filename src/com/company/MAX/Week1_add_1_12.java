package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 11.09.15.
 */
public class Week1_add_1_12 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите силу ветра в метрах в секунду: ");

		int value = scanner.nextInt();

		if (value >= 1 && value <= 4){
			System.out.print("Слабый.");
		} else if (value >= 5 && value <= 10) {
			System.out.print("Умеренный.");
		}else if (value >= 11 && value <= 18) {
			System.out.print("Сильный.");
		}else if (value >= 19) {
			System.out.print("Ураганный.");
		}

	}
}
