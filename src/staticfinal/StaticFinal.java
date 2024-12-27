package staticfinal;

public class StaticFinal {
	
	static String desig="QA"; // without obj creation we can access the variable.we can also modify the value
	final double pi=3.142; // we can't change the variable it is always constant,and need to create obj
	//static final double pi=3.142; // if using static with final then no need to create obj
	

	public static void main(String[] args) {
		System.out.println(desig);
		System.out.println(desig="QA Testing");
		StaticFinal ob=new StaticFinal();
		System.out.println(ob.pi);

	}

}
