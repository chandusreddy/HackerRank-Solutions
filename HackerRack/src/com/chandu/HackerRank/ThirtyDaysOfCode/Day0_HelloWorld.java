package com.chandu.HackerRank.ThirtyDaysOfCode;

import java.util.Scanner;

public class Day0_HelloWorld {

	public static void main(String[] args) {
		// Reading the input line using the Scanner class
		Scanner scan = new Scanner(System.in);
		// Storing the user input
		String InputString = scan.nextLine();
		//closing the Scanner 
		scan.close();

		System.out.println("Hello World");
		System.out.println(InputString.toString());
		
		
	}

}
