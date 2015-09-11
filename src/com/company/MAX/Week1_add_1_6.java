package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 11.09.15.
 */
public class Week1_add_1_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value of speed: ");
		float speed = scanner.nextFloat();

		System.out.print("Enter value of distance: ");
		float distance = scanner.nextFloat();

		double time = distance / speed;

		System.out.printf("Time is: %,.2f", time);

	}
}
