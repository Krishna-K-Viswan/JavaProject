package exceptions;

public class ExceptionPgm {

	public static void main(String[] args) {
		try {
		 int a=10/0;
		 System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		 System.out.println("Hi");
		 
		 try {
			 String s=null;
			 System.out.println(s.length()); 
		 }
		 catch(NullPointerException el) {
			 System.out.println("Error Message");
		 }
		

	}

}
