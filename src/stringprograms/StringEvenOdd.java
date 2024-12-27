package stringprograms;

public class StringEvenOdd {

	public static void main(String[] args) {
		//to print even word only
		String s1="all is well";
		String[] s=s1.split(" ");
		for (String e:s)//for each loop
		{
			if(e.length()%2==0 && e.length()!=0)
			{
				System.out.println(e);
			}
			
		}

	}

}
