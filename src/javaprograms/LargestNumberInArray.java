package javaprograms;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,35,60,23,34,45};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("The largest number is :"+max);
		
	}

}
