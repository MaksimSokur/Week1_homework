package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 08.09.15.
 */
public class Week1_4_5 {
	public static void main(String[] args){
		int sum, difference;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter two values: ");

		int value_one = scanner.nextInt();
		int value_two = scanner.nextInt();

		if(value_one>value_two){
			sum = value_one - value_two;
			System.out.printf("Sum is: %d", sum);
		}else{
			difference = value_one + value_two;
			System.out.printf("Difference is: %d", difference);

		}

	}

}
