package javaprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		//1 swap
		/*int a=10;
		int b=20;
		int c;
		c=b;
		b=a;
		a=c;
		System.out.println("value of a & b after swapping is");
		System.out.println("a ="+a);
		System.out.println("b ="+b);*/
		
		//2 alphabets printing
		/*char i;
		for(i='a';i<='z';i++)
		{
			System.out.println(i);
		}*/
		
		 //check if the two numbers 23 and 45 are equal
		/*int a=23;
		int b=45;
		if(a==b) 
		{
			System.out.println("23 and 45 are equal");
		}
		else
		{
			System.out.println("23 and 45 are not equal");
		}*/
		
		//OR
		/*int a=23;
		int b=45;
		System.out.println(a==b);--false*/
		
		//3 a and b as 55 and 70 respectively and then check if both the conditions a<50 and a<b are true
		/*int a=55;
		int b=70;
		System.out.println(a<50 && a<b);--false*/
		
		//4 i/p int a=20,b=30. Swap without a variable...o/p b=20,a=30
		/*int a=10;
		int b=20;
		System.out.println("value of a and before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-20;
		a=a-10;
		System.out.println("value of a and after swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);*/
		
		//5 int a=17. Print 2nd digit
		/*int a=17;
		System.out.println(a%10);*/
		
		//6 fibonacci series
	/*	int n1=0,n2=1,n3,i;
		int count=10;
		System.out.println(n1);
		System.out.println(n2);
		for(i=2;i<=count;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}*/
		
		//7 increasing or decreasing order
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && b<c)
		{
			System.out.println("Increasing order");
		}
		else if(a>b && b>c)
		{
			System.out.println("Decreasing order");
		}
		else
		{
			System.out.println("Neither increasing nor decreasing order");
		}*/
		
		//8 odd numbers b/w 1 to 100
		/*System.out.println("The odd numbers are");
		for(int i=1;i<=100;i++)
		{
			if(i%2 !=0)
			{
				System.out.println(i);
			}
		}*/
		
		//9 number pattern
		/*1 1 1 1 1 
		2 2 2 2 
		3 3 3 
		4 4 
		5*/
	/*	int n=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
			}
			System.out.println();
			n++;
			
		}*/
		
		//10 pattern
		/*1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2 
		1*/ 
		/*int n=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				n++;
			}
			System.out.println();
			
			}*/
		
		//11 pattern
		/*1 2 3 4 5 
		6 7 8 9 
		10 11 12 
		13 14 
		15*/
		/*int n=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}*/
		
		//12 palindrome
		/*int n;
		int rev=0;
		int r=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp=n;
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
			if(temp==rev)
			{
				System.out.println(rev+" "+"is palindrome number");
			}
			else
			{
				System.out.println(rev+" "+"is not palindrome number");
			}*/
		
		//13 prime number
		/*int i,m=0;
		System.out.println("Enter a positive number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		m=n/2;
		if(n==0 || n==1)
		{
			System.out.println(n+" "+"is not prime number");
		}
		else
		{
			for (i=2;i<=m;i++)
			{
				if(n%i ==0)
				{
					System.out.println(n+" "+"is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(n+" "+"is prime number");
			}
		}
		*/
		
		//14 factorial
	/*	int n=5;
		int fact=1;
	    for(int i=1;i<=n;i++)
	    {
	    	fact=fact*i;
	    	
	    }
	    System.out.println("Factorial of"+" "+n+" "+"is "+fact);*/
		
		//15 multiplication table
		/*int a=5;
		for(int i=1;i<=a;i++)
		{
			System.out.printf("%d * %d= %d \n",i,a,i*a);
		}*/
		
		//16 pattern
		/* ***
		   ***
		   *** */
		/*for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//17 pattern
		/* *
		   **
		   ***
		   ****
		   ***** */
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//18 pattern
		/*1 
		2 2 
		3 3 3 
		4 4 4 4 
		5 5 5 5 5*/ 
	/*	int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
			}
			System.out.println();
			n++;
		} */
		
		//19 pattern
		/*1 
		2 3 
		4 5 6 
		7 8 9 10*/ 
		/*int n=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
			
		}*/
		
		//20 count (no of digits in the given integer)
		/*int n=5876;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Total no of digits : "+count);*/
		
		//21 reverse
		/*int n=1234;
		int rev=0;
		int r;
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		System.out.println("reverse number is : "+rev);*/
		
		//22 armstrong number
		/*int n=153;
		int r=0,sum=0,temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" "+"is armstrong number");
		}
		else
		{
			System.out.println(temp+" "+"is not armstrong number");
		}*/
		
		//23 do while
		/*int n=0;
		do {
			System.out.println("krishna");
			n++;
		}
		while(n<=4);*/
		
		//24 reverse string words
	/*	System.out.println("enter a string");//hi hello
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev=reverseWords(s);
		System.out.println(rev);
	}
	
	public static String reverseWords(String str)
	{
		List<String> a=Arrays.asList(str.split(" "));
		Collections.reverse(a);
		System.out.println("Reverse string is : ");
		return String.join(" ",a); //hello hi
	}*/
		
		//25 
		
		/* System.out.println("Enter a string");   
		 Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine();
		 String s1="";
		 while(s != null)
		 {
			 if(s.length()/10) {
				 
			 }
		 }*/
		
		int n=1;
		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				n++;
			}
			System.out.println();
			
		}
}
}

