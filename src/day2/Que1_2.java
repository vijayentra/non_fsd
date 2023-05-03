package day2;

class Parent {
	  void bowl() {
	    System.out.println("Fast Bowler");
	  }
	}
	class Child extends Parent {
	  void bowl() {
	    System.out.println("Spin Bowler!");
	  }
	}
	public class Que1_2 {
	  public static void main(String[] args) {
	    Parent f = new Parent();
	    f.bowl();
	    Parent c = new Child();
	    c.bowl();
	  }
	}