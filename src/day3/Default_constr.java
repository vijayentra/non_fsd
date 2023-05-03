package day3;

public class Default_constr {
	int id;  
	String name;  
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[]){  
	  
		Default_constr s1=new Default_constr();  
		Default_constr s2=new Default_constr();  
	  
		s1.display();  
		s2.display();  
		}  
}	
