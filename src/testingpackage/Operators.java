package testingpackage;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic oprtrs
		int a=10,b=20;
		System.out.println("a+b=" +(a+b));
		System.out.println("a-b=" +(a-b));
		System.out.println("a*b=" +(a*b));
		System.out.println("a/b=" +(a/b));
		System.out.println("a%b=" +(a%b));
		
		//Assignment oprtrs
		int z=a+b;
		int d=a-b;
		System.out.println(z);
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
		System.out.println((a+=b));
		System.out.println((a-=b));
		
		//Relational oprtrs--true--false
		System.out.println(a==b);//f
		System.out.println(a!=b);//t
		System.out.println(a<=b);//t
		System.out.println(a>=b);//f
		System.out.println(a<b);//t
		System.out.println(a>b);//f
		
		//Logical oprtrs
		String username="abc";
		String pwd="1234";
		System.out.println((username=="abc") && (pwd=="1234"));
		System.out.println((username=="abc") && (pwd=="1233"));
		System.out.println((username=="abc") || (pwd=="1234"));
		System.out.println((username=="abc") || (pwd=="1233"));
		System.out.println(!(username=="abc"));
		System.out.println((username=="abc") == (pwd=="1233"));
		
		//Unary oprtrs
		int i=10 , j=20;
		System.out.println(i++);//10
		System.out.println(i);//11
		System.out.println(++i);//12
		System.out.println(i);//12
		
		//Ternary oprtrs(?:)
		//variable=condition?exp1:exp2;
		String s=j>i?"j is larger" : "i is larger";
		System.out.println(s);
		
		
		
		

	}

}
