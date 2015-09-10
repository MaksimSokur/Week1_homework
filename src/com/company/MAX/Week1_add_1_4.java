package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 10.09.15.
 */
public class Week1_add_1_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите значение скорости в км/ч: ");

		int kilometerInHour = scanner.nextInt();

		System.out.print("Введите значение скорости в м/с: ");

		int metersInSeconds = scanner.nextInt();

		int sum = kilometerInHour * (1000 / 3600);

		if (sum > metersInSeconds) {
			System.out.print("Первое значение больше второго ");
		} else if (sum == metersInSeconds) {
			System.out.print("Первое значение равно второму ");
		} else if (sum < metersInSeconds) {
			System.out.print("Первое значение меньше второго ");
		}
	}
}