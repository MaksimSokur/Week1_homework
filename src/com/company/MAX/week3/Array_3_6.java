package com.company.MAX.week3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by root on 12.09.15.
 */
public class Array_3_6 {
	public static void main(String[] args) {


		int[] a = new int[5] ;

		Random random = new Random();

		for (int i = 0; i < a.length; i++) {

			a[i] = random.nextInt(10);
			System.out.printf("Случайное значения масива №[%d] = ", i);
			System.out.printf("%d \n", a[i]);
		}
		}
}
