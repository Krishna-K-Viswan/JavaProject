package javaprograms;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int i,m=0;
		System.out.println("Enter a positive digit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		m=n/2;
		if(n==0 || n==1  || n%2==0 && m!=1 ){
			System.out.println(n+" "+ "is not prime number");
		}
		else
		{
			System.out.println(n+" "+ "is prime number");
		}

	}

}
