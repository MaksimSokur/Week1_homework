package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 07.09.15.
 */
public class homework_2 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("ведіть три числа: ");
		int first_number  = scanner.nextInt();
		int second_number = scanner.nextInt();
		int third_number  = scanner.nextInt();

		if(first_number > second_number && first_number > third_number){
			System.out.printf("Biggest number is first number: %d", first_number);
		}else
			if(second_number > first_number && second_number > third_number){
				System.out.printf("Biggest number is second number: %d", second_number);
			}else
				if(third_number > first_number && third_number > second_number){
					System.out.printf("Biggest number is third number: %d", third_number);
				}
		if(first_number < second_number && first_number < third_number){
			System.out.printf("\nSmallest number is first number: %d", first_number);
		}else
			if(second_number < first_number && second_number < third_number){
			System.out.printf("\nSmallest number is second number: %d", second_number);
		}else
			if(third_number < first_number && third_number < second_number){
			System.out.printf("\nSmallest number is third number: %d", third_number);
		}
	}
}
