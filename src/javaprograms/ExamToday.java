package javaprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExamToday {

	public static void main(String[] args) {
/*		int n=1;
		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				n++;
			}
			System.out.println();

	}

}*/
		 /*     System.out.println("Enter a string");
				Scanner sc=new Scanner(System.in);
				String s=sc.nextLine();
				String rev=reverseWords(s);
				System.out.println(rev);
				
			}

			private static String reverseWords(String s) {
				List<String> a=Arrays.asList(s.split(" "));
				Collections.reverse(a);
				return String.join(" ", a);
			}*/
		
		/*int a[]={1,2,5,6,3,2};  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]);  
		} 
		 
		}*/	
		
		
		    String s = "I am Krishna";    
	        int count = 0;    
	      
	        for(int i = 0; i < s.length(); i++) {    
	            if(s.charAt(i) != ' ')    
	                count++;    
	        }       
	        System.out.println("Total number of characters in a string: " + count);  

}
}
