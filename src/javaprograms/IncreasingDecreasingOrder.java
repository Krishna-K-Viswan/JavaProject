package javaprograms;

import java.util.Scanner;

public class IncreasingDecreasingOrder {

	public static void main(String[] args) {
		System.out.println("Enter three numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && b<c)
		{
			System.out.println("Increasing");
		}
		else if(a>b && b>c)
		{
			System.out.println("Decreasing");
		}
		else{
			System.out.println("Neither increasing nor decreasing");
		}

	}

}
