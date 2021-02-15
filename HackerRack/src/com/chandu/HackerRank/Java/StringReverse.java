package com.chandu.HackerRank.Java;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();

//		StringBuilder B = new StringBuilder(A);
//		String reverse = B.reverse().toString();
//		if (A.equals(reverse)) {
//			System.out.println("Yes");
//
//		} else {
//			System.out.println("NO");
//		}

		int pointer_a =0;
		int pointer_b = A.length()-1;
		if(pointer_a <= pointer_b) {
			if(A.charAt(pointer_a)!= A.charAt(pointer_b)) {
				System.out.println("NO: The Reversed String is not same as the original input String");
				return;
			}
			pointer_a++;
			pointer_b--;
		}
			
				System.out.println("YES - This is the string that has the same name even its reversed:" +A);
			
			
		}
		
		
		
		
	}


