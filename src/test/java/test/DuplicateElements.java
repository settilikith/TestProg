package test;

public class DuplicateElements {

	public static void main(String[] args) {
		int a[]= {10,20,30,20,40,10};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j]&&i>j)
				{
					break;
				}
				else if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(a[i]);
			}
		}
		
		// TODO Auto-generated method stub

	}

}
