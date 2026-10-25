package hub;

import java.util.*;

public class itux {
	public static void main(String[] args)
	{
		try
		{
		System.out.println("Connection Established");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=in.nextInt();
		System.out.println("Enter the second number");
		int b=in.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Enter non-zero denominator");
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter valid Input");
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
		}
		System.out.println("Connection is Terminated");
		
	}
}
