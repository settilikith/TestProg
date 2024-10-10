package test;

public class ReverseWord {

	public static void main(String[] args) {
		String s="Iam good Person";
		String[]st=s.split(" ");
		String res="";
		for(int i=st.length-1;i>=0;i--)
		{
			res+=st[i]+" ";
		}
		System.out.println(res);
		// TODO Auto-generated method stub

	}

}
