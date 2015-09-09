package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 08.09.15.
 */
public class Week1_4_7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter two values: ");

		double value_one = scanner.nextDouble();
		double value_two = scanner.nextDouble();

		double sum = value_one % value_two;
		if (sum == 0) {
			sum = value_one / value_two;
			System.out.printf("True: %f", sum);
		} else {
			sum = value_one / value_two;
			System.out.printf("False: %f", sum);
		}


	}
}