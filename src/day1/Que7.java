//Write a program that takes an integer as input and prints all the numbers from 1 to that
//integer. (Use a for loop)

package day1;

import java.util.Scanner;

public class Que7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number");
		Integer value = sc.nextInt();
		
		for(int i=1;i<=value;i++) 
		{
			System.out.println(i);
		}
	}
}
