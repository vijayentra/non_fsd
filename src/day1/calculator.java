package day1;

import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("1st number :");
	    int a = sc.nextInt();

	    System.out.println("2nd number :");
	    int b = sc.nextInt();

	    System.out.println("Select operation");
	    System.out.println(
	    		"Addition-a: "
	    		+ "Subtraction-s: "
	    		+ "Multiplication-m: "
	    		+ "Division-d: ");
	    
	    char ch = sc.next().charAt(0);
	    switch(ch) 
	    {
	    	case 'a' :
	    		System.out.println("Addition: "+(a+b));
	    		break;
	    	case 's' :
	    		System.out.println("Subtraction: "+(a-b));
	    		break;
	    	case 'm' :
	    		System.out.println("Multiplication: "+(a*b));
	    		break;
	    	case 'd' :
	    		System.out.println("Division: "+(a/b));
	    		break;
	    	default :
	    		System.out.println("Invalid Input");
	    }	
	}	
}
