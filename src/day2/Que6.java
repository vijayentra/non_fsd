//Array sorting

package day2;

public class Que6 {

	public static void main(String[] args)
	{        

		int [] intArray = new int [] {52,45,32,64,12,87,78,98,23,7};     
        int temp = 0;    
  
        System.out.println("Original array: ");    
        for (int i = 0; i <intArray.length; i++)
        {     
        	System.out.print(intArray[i] + " ");    
        }    
  
        for (int i = 0; i <intArray.length; i++)
        {     
          for (int j = i+1; j <intArray.length; j++)
          {     
              if(intArray[i] >intArray[j])
              {      
            	  temp = intArray[i];    
            	  intArray[i] = intArray[j];    
            	  intArray[j] = temp;    
               }     
            }     
        }        
        System.out.println("\nArray sorted in ascending order: ");    
        for (int i = 0; i <intArray.length; i++) {     
            System.out.print(intArray[i] + " ");    
        }    
    }
}
