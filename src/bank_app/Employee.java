//Create a class called "Employee" with properties like name, employee ID, and salary. 
//Write a program to display who’s name start from “A”.


package bank_app;

import java.util.Scanner;

public class Employee {
	
	public static void main(String[] args) {


		String name;
		int e_Id;
		long sal;

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the empid : ");
		e_Id = in.nextInt();
		
		System.out.print("Enter the name : ");
		name = in.next();
		
		System.out.print("Enter the salary : ");
		sal = in.nextLong();
		
		

	}
}
