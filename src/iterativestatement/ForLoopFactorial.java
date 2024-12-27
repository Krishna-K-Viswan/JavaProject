package iterativestatement;

public class ForLoopFactorial {

	public static void main(String[] args) {
		int fact=1;
		int n=5;
		for(int i=1;i<=n;i++) 
		{
			fact=fact*i;
			//System.out.println(fact);
		}
       System.out.println("factorial of " +n+"=" +fact);
	}

}

//1*1=1,1*2=2,2*3=6,6*4=24,24*5=120,5!=120