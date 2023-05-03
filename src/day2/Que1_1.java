//Write a program to illustrate method overloading and method overriding

package day2;

public class Que1_1 {
	public static int area(int side) {
	    //calculates and returns the area of square
	    return side * side;
	  }
	  public static int area(int side1, int side2) {
	    //calculates and returns the area of rectangle
	    return side1 * side2;
	  }
	  public static void main(String[] args) {
	    System.out.println(area(5));
	    System.out.println(area(5, 2));
	  }
}
