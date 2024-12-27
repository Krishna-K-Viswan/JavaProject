package decisionstatement;

public class IfElseIf {
	public static void main(String[] args) {
		int a=10,b=20,c=25;
		if(a>=b  && a>=c) {
			System.out.println("a is larger");
			}
		else if(b>=a && b>=c) {
			System.out.println("b is larger");
		}
		else {
			System.out.println("c is larger");
		}
	
	}
}
