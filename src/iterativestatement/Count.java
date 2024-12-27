package iterativestatement;

public class Count {

	public static void main(String[] args) {
		int n=5876;
		int count=0;
		while(n > 0)
		     {
	         n = n / 10;//5876/10=587//587/10=58//58/10=5//5/10=0
	         count++;
	          }
		 System.out.println("Number of digits in the given integer are:: " + count);

	}
}
	
	
