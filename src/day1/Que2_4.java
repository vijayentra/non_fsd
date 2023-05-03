//Write a Java program to convert a string to a double.
package day1;

public class Que2_4 {
	
	public static void main(String[] args) {
		String str = "22.345";  
		System.out.println(((Object)str).getClass().getName());
		double d = Double.parseDouble(str);  
		System.out.println(d);
		System.out.println(((Object)d).getClass().getName());
	}
}
