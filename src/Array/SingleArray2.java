package Array;

import java.util.Scanner;

public class SingleArray2 {

	public static void main(String[] args) {
		
		int[] a=new int[3];
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=2;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=2;i++) {
			System.out.println(a[i]);
		}
	/*	int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		for(int i=0;i<=2;i++) {
			a[i]=sc.nextInt();
			System.out.println(a[i]);*/
		}

	}


