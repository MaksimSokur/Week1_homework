package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 11.09.15.
 */
public class Week1_add_1_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter three value: ");

		int value_1 = scanner.nextInt();
		int value_2 = scanner.nextInt();
		int value_3 = scanner.nextInt();

		if(value_1 == value_2 || value_1 == value_3 || value_2 == value_3){
			System.out.print("Yes!");
		}else
			System.out.print("NO!");
	}
}