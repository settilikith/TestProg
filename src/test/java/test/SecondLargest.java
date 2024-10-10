package test;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {10,30,40,50,41,42};
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				secondlargest=largest;
				largest=a[i];
			}
			else if(a[i]<largest&&a[i]!=a.length)
			{
				secondlargest=a[i];
			}
		}
		System.out.println(secondlargest);
		// TODO Auto-generated method stub

	}

}
