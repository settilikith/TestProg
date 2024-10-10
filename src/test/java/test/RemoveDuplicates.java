package test;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s="GoodNight";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			for(int j=0;j<=i;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(c[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
