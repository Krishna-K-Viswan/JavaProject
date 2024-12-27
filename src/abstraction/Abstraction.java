package abstraction;

abstract class Cars{
	
	 abstract public void accelaration();
	 
	 public void engineDetails() {
		 System.out.println("Engine Deatils");
	 }
	
}

class BMW extends Cars{

	@Override
	public void accelaration() {
		System.out.println("BMW accelaration details");
		}
	
}

class Swift extends Cars{

	@Override
	public void accelaration() {
		System.out.println("Swift accelaration details");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
	    BMW b=new BMW();
		b.accelaration();
		b.engineDetails();
		Swift s=new Swift();
		s.accelaration();
		s.engineDetails();
		

	}

	

}
