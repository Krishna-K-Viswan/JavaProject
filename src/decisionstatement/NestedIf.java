package decisionstatement;

public class NestedIf {
	
	public static void main(String[] args) {
		int a=55;
		if(a%5==0) {
			if(a%11==0) {
				System.out.println("a is divisible by 5 And 11");
			}
			else {
				System.out.println("a is divisible by 5 only");
			}
		}
			else {
				System.out.println("a is not divisible by 5 and 11");
			}
			
			}
	}

	


