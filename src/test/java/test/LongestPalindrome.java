package test;

import java.util.Arrays;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s="madama hahah dad";
		String[]word=s.split(" ");
		String result="";
		for(String words:word)
		{
			StringBuffer sb=new StringBuffer();
			StringBuffer st=sb.append(words);
			String rev =st.reverse().toString();
			if(rev.equals(words)&&rev.length()>result.length())
			{
				result=rev;
			}
		}
		System.out.println(result);
		// TODO Auto-generated method stub
	}

}
