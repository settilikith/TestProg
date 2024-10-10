package test;

public class Series {

	public static void main(String[] args) {
		int a=0,b=1,c=2;
		int d=0;
		int n=10;
		while(n>0)
		{
			System.out.print(a+" ");
			a=b;
			b=c;	
			c=d;
			d=a+b+c;
			n--;
		}
		// TODO Auto-generated method stub

	}

}
