//a program that takes three integers as input and prints the largest one.

package day1;

import java.util.Scanner;

public class Que6 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		Integer v1 = sc.nextInt();
		System.out.println("Enter 2nd Number");
		Integer v2 = sc.nextInt();
		System.out.println("Enter 3rd Number");
		Integer v3 = sc.nextInt();
		if (v1 >= v2 && v1 >= v3)
	         System.out.println( v1 + " is the largest number.");
	      else if (v2 >= v1 && v2 >= v3)
	         System.out.println( v2 + " is the largest number.");
	      else
	         System.out.println( v3 + " is the largest number.");
		
	}
}
