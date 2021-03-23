package com.chandu.HackerRank.ThirtyDaysOfCode;

import java.util.Scanner;

public class Day29_BitwiseAND {
	/*
	 * Complete the 'bitwiseAnd' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 
	 * 1 . INTEGER N 
	 * 2. INTEGER K
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		for (int tc = 0; tc < T; tc++) {
			 //1 . INTEGER N 
			int N = scan.nextInt();
			// 2. INTEGER K
			int K = scan.nextInt();

			System.out.println(bitwiseAnd(N, K));
		}

		scan.close();
	}

	public static int bitwiseAnd(int N, int K) {
		int result = 0;
		for (int A = 1; A <= N; A++) {
			for (int B = A + 1; B <= N; B++) {
				int current = A & B;
				if (current > result && current < K) {
					result = current;
				}
			}
		}
		return result;
	}
}
