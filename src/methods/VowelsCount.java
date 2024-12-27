package methods;

import java.io.InputStream;
import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s.toLowerCase();
		VowelsCount vcount=new VowelsCount();
		int count=vcount.vowelCount(s);
		System.out.println("Number of vowels: " + count); 
	}
		
	public int vowelCount(String s)
		{
			int count=0;
			for(int i = 0; i < s.length(); i++) 
			{    
	          if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
	            {    
	                   count++;    
	            }  
			}
			return count;
		}
}

	
	
	//-------------vowel and consonant count-----------------------------------------
	
	/*int vCount=0,cCount=0;
	  for(int i = 0; i < s.length(); i++) {    
         
		if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
      {    
             
          vCount++;    
      }    
         
      else if(s.charAt(i) >= 'a' && s.charAt(i)<='z') {      
              
          cCount++;    
      }    
  }    
  System.out.println("Number of vowels: " + vCount);    
 */ //System.out.println("Number of consonants: " + cCount);
	               
	            
	          


	


