package day2;

import java.util.Scanner;

public class Que7 {

	public static void main(String[] args) {
		int n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		n = sc.nextInt();
		
		int[] dup_arr = new int[n];
		System.out.println("Add Array elements");
		
		for(int i=0;i< dup_arr.length;i++)
		{
			dup_arr[i] = sc.nextInt();
		}
		for(int i=0;i< dup_arr.length;i++)
		{
			for(int j=i+1;j< dup_arr.length;j++)
			{
				if(dup_arr[i]== dup_arr[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println("Count of Duplicate elements: "+count);
	}
}
