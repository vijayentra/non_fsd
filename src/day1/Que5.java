//Write a program that takes an integer as input and prints whether it is positive, negative, or
//zero.

package day1;

import java.util.Scanner;

public class Que5 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value");
		Integer value = sc.nextInt();
		
		if(value == 0)
		{
			System.out.println("Zero");
		}
		else 
		{
			if(value < 0)
			{
				System.out.println("Negative");
			}
			else if(value > 0)
			{
				System.out.println("Positive");
			}
		}
	}
}
