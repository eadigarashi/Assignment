package com.jsp;

import java.util.Scanner;

public class ExampleProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				System.out.println("Even numbers"+i);
			}
			else
			{
				System.out.println("Odd numbers"+i);
			}
		}
		
	}

}
