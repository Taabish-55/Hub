package hub;
import java.util.*;
public class buub {
	public void ddd() throws Exception
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Connection 2 Established");
		System.out.println("Enter the 1st Number");
		int a=in.nextInt();
		System.out.println("Enter the 2nd Number");
		int b=in.nextInt();
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		try
		{
		System.out.println("Connection 1 Established");
		buub b=new buub();
		b.ddd();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
