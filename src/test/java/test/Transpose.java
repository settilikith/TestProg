package test;

public class Transpose {
	public static void main(String[] args) {
		int a[][]= {{10,20},{30,40}};
		int[][]transpose=new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				transpose[j][i]=a[i][j];
			}
		}
		for(int[] is:transpose)
		{
			for(int s:is)
			{
				System.out.print(s+" ");
			}
			System.out.println();
		}
		
		
	}

}
