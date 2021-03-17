package com.chandu.HackerRank.thirtydays;

/*Objective
Today, we are building on our knowledge of arrays by adding another dimension. Check out the Tutorial tab for learning materials and an instructional video.

Context
Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

Task
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

Example

In the array shown above, the maximum hourglass sum is  for the hourglass in the top left corner.

Input Format

There are  lines of input, where each line contains  space-separated integers that describe the 2D Array .

Constraints

Output Format

Print the maximum hourglass sum in .

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11TwoDArray {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int max_sum = Integer.MIN_VALUE;
        for(int row=0;row<4;row++){
            for(int col=0;col<4;col++){
                
            int sum= arr[row][col]+arr[row][col+1]+arr[row][col+2]+arr[row+1][col+1]+arr[row+2][col]+arr[row+2][col+1]+arr[row+2][col+2];
            if(sum>max_sum){
                max_sum=sum;
            }
            }
            
            
        }
    System.out.println(max_sum);
        scanner.close();
    }
}
