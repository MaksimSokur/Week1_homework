package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 11.09.15.
 */
public class Week1_add_1_15 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите шплощадь круга: ");
		double squareCicle = scanner.nextDouble();

		System.out.print("Введите шплощадь квадрата: ");
		double squareRectangle = scanner.nextDouble();

		double radiusKruga = Math.sqrt(squareCicle/ 3.1415);
		double storonaKvadrata = Math.sqrt(squareRectangle);

		double Rv = storonaKvadrata / 2;
		double Ro = Math.sqrt(2)/2 * storonaKvadrata;

		if (Rv > radiusKruga){
			System.out.print("Круг поместится в квадрате!");
		}else if (Ro < radiusKruga ){
			System.out.print("Квадрат поместится в круге!");
		}

	}
}
