package iterativestatement;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		int r=0;
		int sum=0;
		int temp=n;
		while(n>0)
		{
			r=n%10;//3//5//1
			sum=sum+(r*r*r);//0+27//27+5*5*5=152//152+1=153
			n=n/10;//15//1//0
			}
		if(temp==sum) {
			System.out.println("153 is armstrong number");
		}
		else { 
			System.out.println("153 is not an armstrong number");
		}

	}

}
