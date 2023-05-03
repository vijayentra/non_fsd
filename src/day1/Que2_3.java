//Write a Java program to convert a double to an integer,

package day1;

public class Que2_3 {

	public static void main(String[] args) {
		
		double d=22.345; 
		System.out.println(((Object)d).getClass().getName());
		
		int i=(int)d;  
		System.out.println(i);
		System.out.println(((Object)i).getClass().getName());
		
	}
}
