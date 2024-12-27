package interfaces;

interface TVremote{
	public void tvRemoteType();
	public void tvRemoteSize();
}
 interface smartTvremote extends TVremote {
	 public void smartTvRemoteColor();
	 public void smartTvRemoteQuality();
 }
 
 class TV implements smartTvremote{

	@Override
	public void tvRemoteType() {
		System.out.println("TV remote type");
		
	}

	@Override
	public void tvRemoteSize() {
		System.out.println("TV remote size");
		
	}

	@Override
	public void smartTvRemoteColor() {
		System.out.println("smart TV remote color");
		
	}

	@Override
	public void smartTvRemoteQuality() {
		System.out.println("smart TV remote quality");
		
	}
	 
 }

public class InterfacePgmNew {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.tvRemoteSize();
		ob.tvRemoteType();
		ob.smartTvRemoteColor();
		ob.smartTvRemoteQuality();
		

	}

}
