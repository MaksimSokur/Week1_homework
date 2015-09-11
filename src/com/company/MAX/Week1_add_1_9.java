package com.company.MAX;

import java.util.Scanner;

/**
 * Created by root on 11.09.15.
 */
public class Week1_add_1_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите рост: ");

		float height = scanner.nextFloat();

		System.out.print("Введите вес: ");

		float veight = scanner.nextFloat();

		float ideal = height - 100;

		if(veight == ideal){
			System.out.print("У вас оптимальный вес!");
		}else if (veight > ideal){
			veight = veight - ideal;
			System.out.println("Вам надо похудеть на " + veight + " кг");
		}else if (veight < ideal){
			veight = ideal - veight;
			System.out.println("Вам надо поправится на " + veight + " кг");
		}
	}
}
