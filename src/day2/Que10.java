package day2;

import java.util.Scanner;

public class Que10 {

	 public static void main(String[] args) {

	        int number , original, remainder, result = 0, n = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number to check :");
	        number = sc.nextInt();
	        
	        original = number;

	        for (;original != 0; original /= 10, ++n);

	        original = number;

	        for (;original != 0; original /= 10)
	        {
	            remainder = original % 10;
	            result += Math.pow(remainder, n);
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }
}
