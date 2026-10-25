package hub;
import java.util.*;
public class kiop {
	public void ddd() throws Exception
	{
		Scanner in=new Scanner(System.in);
		try {
		System.out.println("Connection 2 Established");
		System.out.println("Enter the First no");
		int a=in.nextInt();
		System.out.println("Enter the Second no");
		int b=in.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
			throw e;
		}
		finally
		{
		System.out.println("Connection 2 Terminated");
		}
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		try
		{
		System.out.println("Connectiom 1 Established");
		kiop k=new kiop();
		k.ddd();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Connection 1 Terminated");
	}
}
