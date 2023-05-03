package day2;

import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be factorialized");
		int n = sc.nextInt();
		for(int i =1; i<=n;i++)
		{
			fact*= i;
			
		}
		System.out.println("Factorial of "+n+" is: "+fact);
	}
}
