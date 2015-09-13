package com.company.MAX.week3;

import java.util.Random;

/**
 * Created by root on 13.09.15.
 */
public class Array_4_2 {
	public static void main(String[] args) {
		int value, chislo;
		Random random = new Random();

		value = random.nextInt(10);
		chislo = random.nextInt(10);
		if(value > 0 && chislo > 0 && value % chislo == 0){
			System.out.print("Число простое!");
		}else{
			System.out.print("Число не простое!");

		}

	}
}