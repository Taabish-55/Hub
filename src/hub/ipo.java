package hub;

import java.util.Scanner;

public class ipo {
	public static int[] ddd(int[] ar)
	{
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar;
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
		int[] res=ddd(ar);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}
}
