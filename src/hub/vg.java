package hub;
import java.util.*;
public class vg {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	try
	{
	int n=in.nextInt();
	int[] ar=new int[n];
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=in.nextInt();
	}
	}
	catch(NegativeArraySizeException e)
	{
		System.out.println("Be positive");
	}
	 
}
}
