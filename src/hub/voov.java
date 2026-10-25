package hub;
import java.util.*;
public class voov {
	public static void ddd(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ddd(n);
	}
}
