package com.chandu.HackerRank.JavaSection;

import java.util.Scanner;

/*Given a string , print Yes if it is a palindrome, print No otherwise.
Constraints
 will consist at most  lower case english letters.

Sample Input
madam
Sample Output
Yes

*/
public class JavaStringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/*
		 * String B = new StringBuilder(A).reverse().toString(); if(A.equals(B)) {
		 * System.out.println("Yes"); }else { System.out.println("No"); }
		 */
		int a_pointer = 0;
		int b_pointer = A.length() - 1;

		while (a_pointer <= b_pointer) {
			if (A.charAt(a_pointer) != A.charAt(b_pointer)) {

				System.out.println("No");
				return;
			}
			a_pointer++;
			b_pointer--;
			
		}
		System.out.println("Yes");

	}

}
