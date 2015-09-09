package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 08.09.15.
 */
public class Week_4_6 {
	public static void main(String[] args){
		final int eleven    = 11;
		final int nineghteen = 19;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter two values: ");

		int value_one = scanner.nextInt();
		int value_two = scanner.nextInt();

		int sum = value_one + value_two;
		if(sum >= eleven && sum <= nineghteen )
			System.out.printf("Sum is: %d", sum);
		else
			System.out.print("Error");

	}
}
