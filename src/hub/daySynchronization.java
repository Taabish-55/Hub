package hub;
import java.util.*;
class boy extends Thread
{
	Bathroom bathroom;
	boy(Bathroom bathroom)
	{
		this.bathroom=bathroom;
	}
	@Override
	public void run()
	{
		bathroom.use();
	}
}
class girl extends Thread
{
	Bathroom bathroom;
	girl(Bathroom bathroom)
	{
		this.bathroom=bathroom;
	}
	@Override
	public void run()
	{
		bathroom.use();
	}
}
class Others extends Thread
{
	Bathroom bathroom;
	Others(Bathroom bathroom)
	{
		this.bathroom=bathroom;
	}
	@Override
	public void run() 
	{
		bathroom.use();
	}
}
class Bathroom 
{
	synchronized  void use()
	{
		Thread t=Thread.currentThread();
		try
		{
		System.out.println(t.getName()+" entered the Bathroom");
		Thread.sleep(1000);
		System.out.println(t.getName()+" is using the Bathroom");
		Thread.sleep(1000);
		System.out.println(t.getName()+" exited the Bathroom");
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class daySynchronization {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Bathroom bathroom=new Bathroom();
		
		boy b=new boy(bathroom);
		girl g=new girl(bathroom);
		Others o=new Others(bathroom);
		
		b.setName("BOY");
		b.start();
		
		g.setName("GIRL");
		g.start();
		
		o.setName("OTHERS");
		o.start();
	}
}
