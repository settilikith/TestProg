package test;

public class Frequency {

	public static void main(String[] args) {
		String s="Iam good person liki liki",res="";
		String[]st=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			String s1=st[i]+" ";
			if(!(res.contains(s1)))
			{
				res+=s1;
			}
		}
		System.out.println(res);
		String[] result=res.split(" ");
		for(String r:result )
		{
			int count=0;
			for(String t:st)
			{
				if(t.contains(r))
				{
					count++;
				}
			}
		System.out.println(r+" "+count);
		}
		// TODO Auto-generated method stub

	}

}
