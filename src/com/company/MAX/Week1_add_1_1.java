package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 09.09.15.
 */
public class Week1_add_1_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter three value of triangle: ");

		double tochka_1 = scanner.nextDouble();
		double tochka_2 = scanner.nextDouble();
		double tochka_3 = scanner.nextDouble();

		double a = Math.pow(tochka_1,tochka_1);
		double b = Math.pow(tochka_2,tochka_2);
		double c = Math.pow(tochka_3,tochka_3);

		if(a == b + c || b == a + c || c == a + b){
			System.out.print("Triangle is square!");
		}else{
			System.out.print("Triangle is not square!");
		}

	}
}