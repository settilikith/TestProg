package test;

public class Pattern_2 {
	public static void main(String[] args) 
	{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i==n||j==n||i>=j)
			{
				System.out.print(j+" ");
			}
		}
		System.out.println();

}
}
}
