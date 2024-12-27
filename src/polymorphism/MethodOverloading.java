package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.add();
		m.add(2.5, 3);
		m.add(5, 5);
		m.add(10, 10, 19);

	}
	public void add() {
		int a=10;
		int b=20,c;
		System.out.println(c=a+b);
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a ,int b,int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	public void add(double a ,int b) {
		double c=a+b;
		System.out.println(c);
	}

}
