package javaprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n;
		int rev=0;
		int r=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp=n;
		while(n>0) {
			r=n%10;
		rev=(rev*10)+r;
			n=n/10;
			}
		if(temp==rev) {
			System.out.println(rev+" "+"is palindrome number ");	
		}
		else {
		System.out.println(rev+" "+"is not palindrome number " );
		}

	}

}
