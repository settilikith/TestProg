package test;

import java.util.Arrays;

public class ArrayEnd {

	public static void main(String[] args) {
		int a[]= {0,1,2,0,3,0,4,0,5};
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[n++]=a[i];
			}
		}
		while(n<a.length)
		{
			a[n++]=0;
		}
		System.out.println(Arrays.toString(a));
		// TODO Auto-generated method stub

	}

}
