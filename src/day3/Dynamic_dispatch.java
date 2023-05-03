package day3;

class MobileOS{
    void display()
    {
        System.out.println("We are talking about mobile operating systems.");
    }
}
class Android extends MobileOS{ 
    void display()
    {
        System.out.println("Android is a MobileOS.");
    }
}
class iOS extends MobileOS{
    void display()
    {
        System.out.println("iOS is a MobileOS.");
    }
}

public class Dynamic_dispatch {
public static void main (String[] args) {
	
	MobileOS os = new MobileOS();
	os.display();
	
	os=new Android();
	os.display();
	
	os=new iOS(); 
	os.display();
	}
}
