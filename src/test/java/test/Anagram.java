package test;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="cata",s2="actb";
		char[]c1=s1.toCharArray(),c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1,c2))
		{
			System.out.println("Anagram String");
			
				}
		else
		{
			System.out.println("Not Anagram String");
		}
		// TODO Auto-generated method stub

	}

}
