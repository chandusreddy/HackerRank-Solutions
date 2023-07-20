package com.chandu.HackerRank.ThirtyDaysOfCode;

import java.util.Scanner;

public class Day25_RunningTimeComplexity {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int testCases=scan.nextInt();
        
            
        while(testCases>=1 && testCases<=30)
            {
                int n=scan.nextInt();
                if(n>=1)
                {
                    findPrimeNumber(n);
                }
                else
                {
                    System.out.println("Wrong input");
                }
                testCases--;
            }
            
    }

    static void findPrimeNumber(int num)
    {
        if(num<=1)
        {
            System.out.println("Not prime");   
        }
        else if (num==2)
        {
            System.out.println("Prime");
        }
        else
        {
            int count=0;
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    count=1;
                    System.out.println("Not prime");
                    break;
                }
            }
            if(count==0)
            {
                System.out.println("Prime");
            }
        }
    }
}