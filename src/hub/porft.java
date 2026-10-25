package hub;

import java.util.Scanner;

public class porft {
	public static void ddd(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		ddd(s);
	}
}
