package com.chandu.HackerRank.ThirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20_Sorting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();

		}
		int noofSwaps = bubbleSort(a);
		System.out.println("Array is sorted in " + noofSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length - 1]);

	}

	// Write Your Code Here

	public static int bubbleSort(int arr[]) {
		int temp;
		int numberOfSwaps = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					numberOfSwaps++;
				}

			}

		}

		return numberOfSwaps;
	}

}
