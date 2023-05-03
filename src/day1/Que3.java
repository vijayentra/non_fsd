//Write a program that takes two integers as input and prints whether the first integer is
//greater than, less than, or equal to the second integer.

package day1;

import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Int: ");
		Integer one = sc.nextInt();
		
		System.out.println("Second Int: ");
		Integer two = sc.nextInt();
		
		
		if (one>two)
		{
			System.out.println("Greater");		
		} 
		else if (one==two)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Lesser");;
		}
	}
}
