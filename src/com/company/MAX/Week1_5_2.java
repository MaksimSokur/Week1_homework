package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 09.09.15.
 */
public class Week1_5_2 {
	public static void main(String[] args) {
		int fact = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value: ");

		int value = scanner.nextInt();

		for ( ; value > 0; fact *= value--) {

			System.out.printf("\n %d", fact);
		}

	}
}