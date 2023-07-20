package com.chandu.HackerRank.ThirtyDaysOfCode;

/*Objective 
Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!
Task 
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation. When working with different bases, it is common to show the base as a subscript.
Example 

The binary representation of  is . In base , there are  and  consecutive ones in two groups. Print the maximum, .
Input Format
A single integer, .
Constraints

Output Format
Print a single base- integer that denotes the maximum number of consecutive 's in the binary representation of .
Sample Input 1
5
Sample Output 1
1
Sample Input 2
13
Sample Output 2
2
*/
import java.util.Scanner;

public class Day10_BinaryNumbers {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		
		int count = 0;
		int maxCount = 0;
		while (n > 0) {
			int a = n % 2;
			if (a == 1) {
				count++;
				if (count >= maxCount) {
					maxCount = count;
				}
			} else {
				count = 0;
			}

			n = n / 2;

		}
		System.out.println(maxCount);
		scanner.close();
	}
}
