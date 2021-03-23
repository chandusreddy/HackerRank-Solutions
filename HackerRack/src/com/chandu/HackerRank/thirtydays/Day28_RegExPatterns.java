package com.chandu.HackerRank.ThirtyDaysOfCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28_RegExPatterns {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String regexpattern = "[a-z]+@gmail\\.com$";
		Pattern p = Pattern.compile(regexpattern);
		List<String> namesList = new ArrayList<String>();

		for (int NItr = 0; NItr < N; NItr++) {
			String[] firstNameEmailID = scan.nextLine().split(" ");

			String firstName = firstNameEmailID[0];

			String emailID = firstNameEmailID[1];

			Matcher m = p.matcher(emailID);
			if (m.find()) {
				namesList.add(firstName);

			}
		}

		Collections.sort(namesList);
		for (String value : namesList) {
			System.out.println(value);
		}
		scan.close();
	}
}
