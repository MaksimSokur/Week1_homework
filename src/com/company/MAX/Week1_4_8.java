package com.company.MAX;

import java.util.Scanner;

/*
 Created by root on 08.09.15.
*/
public class Week1_4_8 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter two values: ");

		int value_one = scanner.nextInt();
		int value_two = scanner.nextInt();

		int sum = (value_one - value_two) % 2 ;
		if (sum == 0) {
			System.out.print("True");
		} else if (sum != 0) {
			System.out.print("False");
		}

	}
}
