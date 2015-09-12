package com.company.MAX.week3;

import java.util.Random;

/**
 * Created by root on 12.09.15.
 */
public class Array_3_9 {
	public static void main(String[] args) {


		double[] a = new double[6];

		Random random = new Random();

		for (int i = 0; i < a.length; i++) {

			a[i] = random.nextInt(25);

		}
		double averange_1 = a[0] + a[2] + a[2] / 3;
		double averange_2 = a[3] + a[4] + a[5] / 3;

		if(averange_1 > averange_2){
			for (int i = 0; i < 3; i++){
			System.out.printf("Вывод значений массива № 1 %2f \n", a[i]);}
		}else if (averange_1 > averange_2){
			for (int i = 3; i < 5; i++)
				System.out.printf("Вывод значений массива № 2 %2f\n", a[i]);
		}else if (averange_1 == averange_2){
			System.out.printf("Массивы одинаковые");
		}
	}

	}
