package day3;

	public class  Anonymous 
	{  	
		int a; 
	     
		 Anonymous(int p)
		{ 
			a = p; 
		} 
 
	    void area()
	    { 
	    	int area = a * a; 
	    	System.out.println("Area of square: " +area); 
	    } 
	    void perimeter(int b)
	    { 
	    	int peri = 4 * b; 
	    	System.out.println("Perimeter of square: " +peri); 
	    }	 
	    public static void main(String[] args)
	    { 		 	
	    	new  Anonymous(50).area(); 
	    	new  Anonymous(10).perimeter(100); 
	    	new  Anonymous(20).area(); 
	    	new  Anonymous(30).perimeter(200); 
	    } 
	}
