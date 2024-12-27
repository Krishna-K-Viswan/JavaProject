package iterativestatement;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		int d=0;
		int e=5;
		do {
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum of two numbers = "+c);
		d++;
	}
		while(d<=e);
		
		}

}
