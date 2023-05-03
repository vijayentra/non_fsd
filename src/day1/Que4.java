//Write a program that takes an integer as input and prints whether it is even or odd.

package day1;

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value");
		Integer value = sc.nextInt();
		
		if(value%2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
