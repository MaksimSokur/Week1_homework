package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 08.09.15.
 */
public class Week1_5_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value: ");

		int value = scanner.nextInt();

		String bin_str = Integer.toBinaryString(value);
		System.out.print(bin_str);
		System.out.print("\n");

		System.out.println(Integer.parseInt(bin_str, 2));
	}
}
