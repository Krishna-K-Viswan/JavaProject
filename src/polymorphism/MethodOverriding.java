package polymorphism;

class Parent {
	
public void get() {
	System.out.println("Automation");
}
public void set() {
	System.out.println("Testing");
}
	
}

class Child extends Parent { //overriding need inheritance
	
	public void get() {
		System.out.println("Software");
		super.get();
		//super.set();
	}
	public void set() {
		System.out.println("QA");
	}
	
}

public class MethodOverriding {
	
public static void main(String[] args) {
	Child c=new Child();
	c.get();
	c.set();
	
  }

}
