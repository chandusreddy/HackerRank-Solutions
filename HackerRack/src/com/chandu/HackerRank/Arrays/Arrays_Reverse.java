package com.chandu.HackerRank.Arrays;

import java.util.ArrayList;
import java.util.List;
//https://www.hackerrank.com/challenges/arrays-ds/problem
class Arrays_Reverse {

	/*
	 * Complete the 'reverseArray' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static List<Integer> reverseArray(List<Integer> a) {
		// Write your code here
		List<Integer> rlist = new ArrayList<>();
		for (int i = a.size() - 1; i >= 0; i--) {
			rlist.add(a.get(i));
		}
		return rlist;
	}

}
