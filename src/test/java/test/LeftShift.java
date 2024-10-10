package test;

import java.util.Arrays;

public class LeftShift {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int n=2;
		for(int p=1;p<=n;p++)
		{
			int temp=arr[0];
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
		// TODO Auto-generated method stub

	}

}
