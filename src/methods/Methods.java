package methods;

public class Methods {

	public static void main(String[] args) {
		//method
		Methods m=new Methods();
		m.add();
		System.out.println(m.sub());
		m.mul(5,25);
		System.out.println(m.div(50,10));

	}
	//Method without return type and without parameters add()
	public void add()
	{
	  int a=10,b=20,c;
	  c=a+b;
	  System.out.println(c);
	}
	//Method with return type and without parameters sub()
	public int sub()
	{
		int a=20,b=10,c;
		c=a-b;
		return c;
	}
	//Method without return type and with parameters mul()
	public void mul(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	//Method with return type and with parameters div()
	public double div(int a,int b)
	{
		double d=a/b;
		return d;
	}

}
