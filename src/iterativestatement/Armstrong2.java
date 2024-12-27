package iterativestatement;

public class Armstrong2 {

	public static void main(String[] args) {
		int n=141;
		int temp=n;
		int rem=0;
		int sum=0;
		while(n>0) {
			rem=n%10;//1
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("141 is armstrong number");
			}
		else {
			System.out.println("141 is not an armstrong number");
		}
	}

}
