package com.chandu.HackerRank.ThirtyDaysOfCode;
/*Objective 
Today we're discussing scope. Check out the Tutorial tab for learning materials and an instructional video!
The absolute difference between two integers,  and , is written as . The maximum absolute difference between two integers in a set of positive integers, , is the largest absolute difference between any two integers in .
The Difference class is started for you in the editor. It has a private integer array () for storing  non-negative integers, and a public integer () for storing the maximum absolute difference.
Task 
Complete the Difference class by writing the following:
A class constructor that takes an array of integers as a parameter and saves it to the instance variable.
A computeDifference method that finds the maximum absolute difference between any  numbers in  and stores it in the  instance variable.
Input Format
You are not responsible for reading any input from stdin. The locked Solution class in the editor reads in  lines of input. The first line contains , the size of the elements array. The second line has space-separated integers that describe the  array.
Constraints

, where 
Output Format
You are not responsible for printing any output; the Solution class will print the value of the  instance variable.
Sample Input
STDIN   Function
-----   --------
3       __elements[] size N = 3
1 2 5   __elements = [1, 2, 5]
Sample Output
4

*/

import java.util.Arrays;
import java.util.Scanner;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	//Constructor with array as the input parameter
  	public Difference(int[] elements){
        this.elements = elements;
    }
    public  void computeDifference(){
        Arrays.sort(elements);
        //Subtracting the maximum value from the min value after sorting which gives the max Difference.
        maximumDifference = elements[elements.length-1]-elements[0];
    }
  
    
	// Add your code here

} // End of Difference class

public class Day14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}