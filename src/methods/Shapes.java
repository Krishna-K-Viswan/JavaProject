package methods;

import java.util.Scanner;

public class Shapes {

	public static void main(String[] args) {
		Shapes s=new Shapes();
		s.square();
		System.out.println("Area of the rectangle="+ s.rectangle());
		s.triangle(0, 0);
		System.out.println("Area of the circle="+s.circle(0));
		
	}
	//method without returntype and without parameters
	public void square()
	{
		int a=10,b;
		b=a*a;
		System.out.println("Area of the square ="+b);
	}
	//method with returntype and without parameters
	public int rectangle()
	{
		int l=10,b=8,a;
		a=l*b;
		return a;
	}
	//method without returntype and with parameters
	public void triangle(int b,int h)
	{
		System.out.println("Enter the values");
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		h=sc.nextInt();
		double c=0.5*b*h;
		System.out.println("Area of the triangle ="+c);
		
	}
	//method with return type and with parameters
	public double circle(int r)
	{
		System.out.println("Enter the values");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		double a=3.14*r*r;
		return a;
		
	}

}
