package hub;

import java.util.Scanner;

public class mojassam {
	public static boolean ddd(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!(ch>='0' && ch<='9'))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		System.out.println(ddd(s));
	}
}
