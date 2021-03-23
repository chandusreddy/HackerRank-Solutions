package com.chandu.HackerRank.ThirtyDaysOfCode;

import java.util.Scanner;

public class Day16_StringToInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();

		try {
			int convertedInteger = Integer.parseInt(S);
			System.out.println(convertedInteger);
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}

	}

}
