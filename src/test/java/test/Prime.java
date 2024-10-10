package test;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the value");
		int me=1;
		int n=60;
		for(int m=me;m<=n;m++)
		{
			int count=0;
			for( int Start=2;Start<m;Start++)
			{
				if(m%Start==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.print(m +" ");
			}
		}
		
		// TODO Auto-generated method stub

	}

}
