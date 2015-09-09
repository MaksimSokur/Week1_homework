package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 08.09.15.
 */
public class Week1_4_4 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value in decimal: ");

		double value = scanner.nextDouble();

		if(value >= 0.0 && value <= 1.0)
			System.out.print("Yes!");
		else
			System.out.print("NO!");

	}

}
