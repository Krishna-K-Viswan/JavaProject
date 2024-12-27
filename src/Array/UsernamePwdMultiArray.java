package Array;

import java.util.Scanner;

public class UsernamePwdMultiArray {

	public static void main(String[] args) {
		String[][] arr=new String[3][2];
		System.out.println("Enter the Username and Password");
		Scanner sc=new Scanner(System.in);
		 for (int i=0;i<3;i++)
		  {
		  for (int j=0;j<2;j++)
		  {
		    arr[i][j]=sc.next();
		    }
		    }
		 System.out.println("Username and Password is :");
		  for (int i=0;i<3;i++)
		  {
		  for (int j=0;j<2;j++)
		  {
			  System.out.print(arr[i][j]+" ");
		   }
		  System.out.println();
	       }
		
     }
}

