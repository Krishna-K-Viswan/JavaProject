package javaprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)  { 
		System.out.println("Enter the string");
	      // String s = "I am good at work"; 
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	       String rev = reverseWords(s); 
	       System.out.println(rev); // Output: work at good am i
	   } 
	
	   public static String reverseWords(String str) { 
		   List<String> a = Arrays.asList(str.split(" ")); 
	       Collections.reverse(a); 
	       System.out.println("Reverse string is : ");
	       return String.join(" ", a); 
	   }
} 


