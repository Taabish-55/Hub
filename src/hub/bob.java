package hub;

import java.util.Scanner;
import java.util.LinkedHashSet;
public class bob {
	public static void ddd(int[] ar)
	{
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<ar.length;i++)
		{
			set.add(ar[i]);
		}
		for(Integer x: set)
		{
			System.out.print(x+" ");
		}
	}
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int[] ar=new int[n];
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=in.nextInt();
	}
	ddd(ar);
}
}
