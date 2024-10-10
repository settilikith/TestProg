package test;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=141;
		int rev=0,sum=0;
		for(int n1=n;n1>0;n1=n1/10)
		{
			sum=(n1%10);
			rev=10*sum+rev;
		}
		System.out.println(rev);
		// TODO Auto-generated method stub

	}

}
