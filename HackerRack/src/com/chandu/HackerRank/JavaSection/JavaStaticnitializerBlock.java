package com.chandu.HackerRank.JavaSection;

import java.util.Scanner;

public class JavaStaticnitializerBlock {

	static boolean flag = false	;
	static int B,H;
	static {
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		
			
			if(B<=0||H<=0)
			{
				System.out.println("Java.lang.Exception: Breadth and height must be positive");
				
			}
			else {
				flag = true;
			}
			
		} 
	
	
	public static void main(String[] args)
	{
		
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}// end of main

}// end of class
