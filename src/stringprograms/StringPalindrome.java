package stringprograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev ="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
	}

	}
		
		
		
		
		/*boolean flag=true;
		s=s.toLowerCase();
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i) != s.charAt(s.length()-i-1))
			 {
				flag=false;
				break;
			 }
			 
		}
		if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome"); */
		

