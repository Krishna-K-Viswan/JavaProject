package Array;

import java.util.Scanner;

public class ArraySumAvg {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int arraysize=sc.nextInt();
		int sum=0;
		
		System.out.println("Enter two numbers");
		int[] arr=new int[arraysize];
		for(int i=0;i<arraysize;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			
		}
		System.out.println("Sum of entered numbers="+sum);
		System.out.println("Average of entered numbers="+sum/arraysize);	
		

	}

}
