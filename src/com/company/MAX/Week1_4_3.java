package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 08.09.15.
 */
public class Week1_4_3{
	public static void main(String[] args)
	{
		final int seven = 7;
		int sum;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value:");

		int chislo = scanner.nextInt();

		sum = chislo % seven;
		if (sum == 0 ) {
			sum = chislo * 2;
			System.out.printf("Value is: %d", sum);
		}else
			System.out.print("Error.");

	}
}