package com.company.MAX.week3;

import java.util.Random;

/**
 * Created by root on 12.09.15.
 */
public class Array_3_8 {
	public static void main(String[] args) {


		double[] a = new double[5];

		Random random = new Random();

		for (int i = 0; i < a.length; i++) {

			a[i] = random.nextInt(10);
			System.out.printf("Случайное значения масива №[%d] = ", i);
			System.out.printf("%f \n", a[i]);
		}
		double averange = a[0] + a[2] + a[2] + a[3] + a[4] / a.length;
		System.out.printf("Среденее значение = %f", averange);

	}
}
