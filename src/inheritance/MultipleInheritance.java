package inheritance;

class Birds{
	public void displayBirdsDetails()
	{
		System.out.println("Birds details");
	}
}

class Peacock extends Birds{
	public void peacockDetails()
	{
		System.out.println("Peacock details");
	}
}

class BabyPeacock extends Peacock{
	public void babyPeacockDetails()
	{
		System.out.println("BabyPeacock details");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		BabyPeacock bp=new BabyPeacock();
		bp.displayBirdsDetails();
		bp.peacockDetails();
		bp.babyPeacockDetails();

	}

}
