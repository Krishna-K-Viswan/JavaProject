package javaprograms;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Arrays;

public class ReversePgm {
	
	 static String reverseWords(String str) 
	    { 
	 
	        // Specifying the pattern to be searched 
	        Pattern pattern = Pattern.compile("\\s"); 
	 
	        // splitting String str with a pattern 
	        // (i.e )splitting the string whenever their 
	        // is whitespace and store in temp array. 
	        String[] temp = pattern.split(str); 
	        String result = ""; 
	 
	        // Iterate over the temp array and store 
	        // the string in reverse order. 
	        for (int i = 0; i < temp.length; i++) { 
	            if (i == temp.length - 1) 
	                result = temp[i] + result; 
	            else
	                result = " " + temp[i] + result; 
	        } 
	        return result; 
	    } 

	public static void main(String[] args) {
		/*String s="i am good at work";
		String rev="";
		s.toLowerCase();
		for (int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			System.out.println("Original String ="+s);
			System.out.println("Reversed String ="+rev);*/
		
		/*String[] s=new String[50];
		String rev="";
		s[0]="i";
		s[1]="am";
		s[2]="good";
		s[3]="at";
		s[4]="work";
		for(int i=4;i>=0;i--) {
			rev=rev+" "+s[i];
			System.out.println(rev);*/
		
	    /*String s = "";
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Please enter a phrase you would like to see in mixed order");
        s = sc.nextLine();                       
         
        s.split(s).reverse();*/
	/*	System.out.println(Arrays.toString(reverse("grey fox jumps over dog")));
	}
		
		 public static String[] reverse(String input) {
		        String[] words = input.split("\\s");
		        String[] reversed = new String[words.length];

		        for (int i = 0; i < words.length; i++) {
		            reversed[words.length - i - 1] = words[i];
		        }
		        return reversed;
		}*/
		
		String s1 = "Welcome to geeksforgeeks"; 
        System.out.println(reverseWords(s1));
	}
}






