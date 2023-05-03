package day2;

import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the end term:");
		int n = sc.nextInt();
		int first = 0, second = 1, next;
		
		for(int i=0;i<=n;i++) 
		{
			System.out.print(first+" ");
			next = first+second;
			first = second;
			second = next;
		}
	}
}
