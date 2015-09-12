package com.company.MAX.week3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by root on 12.09.15.
 */
public class Array_3_10 {
	public static void main(String[] args) {


		int[] arrayOne = new int[5];
		int[] arrayTwo = new int[5];
		int[] arraySum = new int[5];

		Random random = new Random();

		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = random.nextInt(25);
		}
		System.out.print(Arrays.toString(arrayOne));
		System.out.print('\n');
		for (int i = 0; i < arrayTwo.length; i++) {
			arrayTwo[i] = random.nextInt(25);
		}
		System.out.print(Arrays.toString(arrayTwo));
		System.out.print('\n');
		for (int i = 0; i < arraySum.length; i++){
			arraySum[i] = arrayOne[i] + arrayTwo[i];
		}
		System.out.print(Arrays.toString(arraySum));
	}
}
