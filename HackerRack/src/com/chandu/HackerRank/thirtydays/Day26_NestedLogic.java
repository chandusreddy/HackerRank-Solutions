package com.chandu.HackerRank.ThirtyDaysOfCode;

import java.util.Scanner;

public class Day26_NestedLogic {
	public static void main(String[] args) {
		int fine = 0;

		Scanner scan = new Scanner(System.in);
		int returnedDay = scan.nextInt();
		int returnedMonth = scan.nextInt();
		int returnedYear = scan.nextInt();

		int dueDay = scan.nextInt();
		int dueMonth = scan.nextInt();
		int dueYear = scan.nextInt();

		scan.close();

		if (returnedYear == dueYear) {
			if (returnedMonth < dueMonth || (returnedMonth == dueMonth && returnedDay <= dueDay)) {
				fine = 0;
			} else if (returnedMonth == dueMonth) {
				fine = (returnedDay - dueDay) * 15;
			} else if (returnedMonth > dueMonth) {
				fine = (returnedMonth - dueMonth) * 500;
			}
		} else if (returnedYear > dueYear) {
			fine = 10000;
		}

		System.out.println(fine);
	}
}