package inheritance;

class Animal{
	public void animalMethod()
	{
		System.out.println("animal details");
	}
}

class Tiger extends Animal{
	public void tigerMethod()
	{
		System.out.println("Tiger details");
	}
}

class Deer extends Animal{
	public void deerMethod()
	{
		System.out.println("Deer details");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		
		Tiger t=new Tiger();
		t.animalMethod();
		t.tigerMethod();
		Deer d=new Deer();
		d.animalMethod();
		d.deerMethod();
	}

}
