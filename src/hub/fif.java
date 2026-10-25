package hub;

import java.util.Scanner;

public class fif {
	public static int ddd(int[] ar,int k)
	{
		int l=0,h=ar.length-1,mid=0;
		while(l<=h)
		{
			mid=(l+h)/2;
			if(ar[mid]==k)
			{
				while(mid+1<ar.length && ar[mid+1]==k)
				{
					mid++;
				}
				break;
			}
			else if(k<ar[mid])
			{
				h=mid-1;
			}
			else if(k>ar[mid])
			{
				l=mid+1;
			}
		}
		if(ar[mid]>k)
		{
			return mid;
		}
		else {
			return mid+1;
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
		int k=in.nextInt();
		System.out.println(ddd(ar,k));
	}
}
