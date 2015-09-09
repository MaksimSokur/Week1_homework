package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 09.09.15.
 */
public class Week1_5_3 {
	public static void main(String[] args) {

		final int eight = 8;
		int count = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value: ");

		int value = scanner.nextInt();

		while (value != 0)
		{
			int	sum = value % 10;
			value = value / 10;
			if(sum == eight){
				count++;}


		}
		System.out.print(count);

	}
}
