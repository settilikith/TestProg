package test;

public class PalindromeRange {

	public static void main(String[] args) {
		int n=99;
		for(int m=1;m<=n;m++)
		{   int temp=m;
			int sum=0,rev=0;
			for(int n1=m;n1>0;n1=n1/10)
			{
				sum=(n1%10);
				rev=10*rev+sum;
			}
			if(rev==temp)
			{
				System.out.print(rev+" ");
			}
		}
		// TODO Auto-generated method stub

	}

}
