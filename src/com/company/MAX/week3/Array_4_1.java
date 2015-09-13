package com.company.MAX.week3;

import java.util.Arrays;

/**
 * Created by root on 13.09.15.
 */
public class Array_4_1 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.print(Arrays.toString(a));

		for(int i = 0; i < a.length >> 1; ++i)
		{
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		System.out.print("\nИнвертированый массив\n");

		System.out.print(Arrays.toString(a));
	}
}
