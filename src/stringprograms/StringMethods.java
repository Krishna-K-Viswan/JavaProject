package stringprograms;

public class StringMethods {

	public static void main(String[] args) {
		String s1="Hi";
		String s2="Java";
		String s3="hi";
		String s4="Simple Program";
		String s5="Jai";
		String s6="  Week  ";
		
		//concate
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println(1+2+s1+5+6+7+8);
		System.out.println(s2.concat(s1));
		
		//equals
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s3));
		
		//toupper and tolower
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		//length
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		//startswith and endswith
		System.out.println(s1.startsWith("Hi"));
		System.out.println(s2.endsWith("Java"));
		
		//contains
		System.out.println(s1.contains("batch"));
		System.out.println(s3.contains("hi"));
		
		//trim
		String s7=s6.trim();
		System.out.println(s7);
		
		//replace
		System.out.println(s5.replace("Jai", "Hello"));
		
		//charAt
		System.out.println(s1.charAt(0));
		
		//split
		String[] s=s4.split(" ");
		for (String e : s) {
			  System.out.println(e);
			}
		
		//subString
		System.out.println(s4.substring(6));
		System.out.println(s4.substring(0,6));
		System.out.println(s4.substring(6,13));
		
		//tochararray
		char[] c=s1.toCharArray();
		for (char e:c)
		{
			System.out.println(e);
		}
		
	}

}
