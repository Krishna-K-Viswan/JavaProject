package interfaces;

interface CarDetails{
	public void acceleration();//mthd declaration--no body--can't create obj for i/f
	public void speedLimit();
	public void torque();
}

class Benz implements CarDetails{

	@Override
	public void acceleration() {
		System.out.println("Benz accelaration");
		
	}

	@Override
	public void speedLimit() {
		System.out.println("Benz speedLimit");
		
	}

	@Override
	public void torque() {
		System.out.println("Benz torque");
		
	}
	
}

public class InterfacePgm {

	public static void main(String[] args) {
		Benz ob=new Benz();
		ob.acceleration();
		ob.speedLimit();
		ob.torque();
	}

}
