package hub;

import java.util.Scanner;

public class coding {
	public static int count(String s)
	{
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		return s.charAt(0)==' '?count:count+1;
	}
	public static String[] split(String s)
	{
		String[] ar=new String[count(s)];
		String t="";
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				t=t+s.charAt(i);
			}
			else if(t.length()>0)
			{
				ar[j]=t;
				j++;
				t="";
			}
		}
		if(t.length()>0)
		{
		ar[j]=t;
		}
		return ar;
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String[] res=split(s);
		for(int i=res.length-1;i>=0;i--)
		{
			System.out.print(res[i]+" ");
		}
	}
}
