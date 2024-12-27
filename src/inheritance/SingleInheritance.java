package inheritance;

class Car{  //parent class
	public void displayMethod() {
		System.out.println("Car details");
	}
	
}

class Bmw extends Car{ //child class
	public void displayBmw() {
		System.out.println("BMW details");
	}
}

public class SingleInheritance {
	
	public static void main(String[] args) {
		Bmw b=new Bmw();
		b.displayMethod();
		b.displayBmw();

	}

}
