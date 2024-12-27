package interfaces;

import java.util.Scanner;

interface BankDetails{
	
	public void accountDetails();//mthd creation
	public void balance();
	public void withdrawl();
	public void deposit();
}

class SBI implements BankDetails{
	int bal=50000;
	int withdrawl;
	int deposit;
	int finalBalance;
	int currentBalance;
	int accountNo;
	Scanner sc=new Scanner(System.in);
	
    @Override
	public void accountDetails() {
		System.out.println("Enter the Account Number");
		long accountNo=sc.nextLong();
		System.out.println("Your Account Number is "+accountNo);
		}

	@Override
	public void balance() {
	    
		System.out.println("Your Account Balance is "+bal);
		
	}

	@Override
	public void withdrawl() {
		
		System.out.println("Enter the amount for withdrawl");
		withdrawl=sc.nextInt();
		finalBalance=bal-withdrawl;
		System.out.println("Your final balance is "+ finalBalance);
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter the amount to deposit");
		deposit=sc.nextInt();
		currentBalance=finalBalance+deposit;
		System.out.println("The current balance is "+ currentBalance );
		
	}
	
}

public class BankApplication {

	public static void main(String[] args) {
		SBI b=new SBI();
		b.accountDetails();
		b.balance();
		b.withdrawl();
		b.deposit();
		

	}

}
