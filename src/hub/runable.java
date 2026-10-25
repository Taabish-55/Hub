package hub;
import java.util.*;
class Addition implements Runnable
{
	@Override
	public void run()
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println(a+b);
		
	}
}
class printnums implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0;i<=9;i++)
		{
			System.out.println(i);
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
	    }
    }
}
class printchars implements Runnable
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"Execution Started");
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class runable
{
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	Addition a=new Addition();
	printnums pn=new printnums();
	printchars pc=new printchars();
	
	Thread t1=new Thread(a);
	t1.start();
	Thread t2=new Thread(pn);
	t2.start();
	Thread t3=new Thread(pc);
	t3.start();
}
}
