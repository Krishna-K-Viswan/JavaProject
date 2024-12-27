package Array;

import java.util.Scanner;

public class PositiveNegativeCount {
	
	    public static void main(String args[])
	    {
	    	
	        int n,positive=0, negative=0, zero=0, i;
	        int[] arr = new int[50];
	        Scanner sc = new Scanner(System.in);
	       
	        System.out.print("Enter the numbers : ");
	        n = sc.nextInt();
		    for(i=0; i<n; i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        for(i=0; i<n; i++)
	        {
	            if(arr[i] < 0)
	            {
	                negative++;
	            }
	            else if(arr[i] == 0)
	            {
	                zero++;
	            }
	            else
	            {
	                positive++;
	            }
	        }
	        System.out.println("Positive Numbers are: " + positive );
	        System.out.println("Negative Numbers are: " + negative );
	        System.out.println("Zero numbers are: " + zero );
	    }
	}
