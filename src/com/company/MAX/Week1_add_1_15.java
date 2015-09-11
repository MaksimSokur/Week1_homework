package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 11.09.15.
 */
public class Week1_add_1_15 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите шплощадь круга: ");
		int squareCicle = scanner.nextInt();

		System.out.print("Введите шплощадь квадрата: ");
		int squareRectangle = scanner.nextInt();

		double radiusKruga = Math.sqrt(squareCicle/ 3.1415);


	}
}
