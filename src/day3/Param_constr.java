package day3;

public class Param_constr {

	  int id;  
	    String name;  
	    
	    Param_constr(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	     
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    }
	    public static void main(String args[]){  
	     
	        Param_constr s1 = new Param_constr(100,"Capg");  
	        Param_constr s2 = new Param_constr(101,"Saba");  
	     
	        s1.display();  
	        s2.display();  
	       }  
}
