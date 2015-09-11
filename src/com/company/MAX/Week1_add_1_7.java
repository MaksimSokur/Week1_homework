package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 11.09.15.
 */
public class Week1_add_1_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите число от 1 до 12: ");

		int value_1 = scanner.nextInt();

		if ( value_1 >= 1 && value_1 <= 2 && value_1 == 12){
			System.out.print("Зима");
		}else if (value_1 >= 3 && value_1 <= 5){
			System.out.print("Весна");
		}else if (value_1 >= 6 && value_1 <= 8) {
			System.out.print("Лето");
		}else if (value_1 >= 9 && value_1 <= 11) {
			System.out.print("Осень");
		}else
			System.out.print("Не верный ввод!");
	}

}
