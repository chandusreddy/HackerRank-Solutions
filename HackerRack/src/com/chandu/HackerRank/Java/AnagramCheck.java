package com.chandu.HackerRank.Java;
/**/
// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true


import java.util.Arrays;
//
import java.util.Scanner;

public class AnagramCheck {
	
	public static boolean isAnagram(String a, String b) {
		
		String str1 = a.replaceAll("\\s", "");
		String str2 = b.replaceAll("\\s", "");
		
		if(str1.length() != str2.length()) {
			return false;
			
		}
		else {
				char c1[] = str1.toLowerCase().toCharArray();
				char c2[] = str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			return Arrays.equals(c1,c2);
		}
			
		
	}
	

public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean result = isAnagram(a,b);
		System.out.println((result) ? "Two Strings are Anagrams" : "Two Strings are not Anagrams");
	
}

}
