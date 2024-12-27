package iterativestatement;

public class ReverseOrPalindrome {

	public static void main(String[] args) {
		int n=1234;
		int reverse=0,a;
		while(n>0) {
			a=n%10;   
			reverse=(reverse*10)+a;
			n=n/10;
			}
		
		System.out.println("reverse number is" +" "+reverse);	

	}

}
