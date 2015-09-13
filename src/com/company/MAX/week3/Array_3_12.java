package com.company.MAX.week3;

import java.util.Arrays;

/**
 * Created by root on 13.09.15.
 */
public class Array_3_12 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int start = 0;
		int end = 10;
		System.out.print(Arrays.toString(splitArray(a, start, end)));
	}

	public static int[] splitArray(int[] arr, int start, int end) {

		int[] result = new int[end - start];

		for (int i = start; i < end; i++) {

			result[i - start] = arr[i];
		}

		return result;
	}

}
