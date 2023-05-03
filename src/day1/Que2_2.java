//Write a Java program to convert a string to an integer,

package day1;

public class Que2_2 {
public static void main(String[] args) {
	String str = "100";
	System.out.println(((Object)str).getClass().getName());
	
	int i = Integer.parseInt(str);
	System.out.println(i);
	System.out.println(((Object)i).getClass().getName());
	
}
}
