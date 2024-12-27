package Array;

public class MultiArray {

	public static void main(String[] args) {
		int[][] arr=new int[2][2];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=5;
		arr[1][1]=6;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		

	}
	
	/*int[][] arr=new int[3][2];
	  Scanner sc=new Scanner(Ssystem.in);
	  syso("enter the numbers");
	  for (int i=0;i<3;i++)
	  {
	  for (int j=0j<2;j++)
	  {
	    arr[i][j]=sc.nextInt();
	    }
	    }
	    syso("entered numbers are:");
	  for (int i=0;i<3;i++)
	  {
	  for (int j=0j<2;j++)
	  {
	    syso.print(arr[i][j]+" ");
	   }
	    syso.println();
	    }
	    
	  */

}
