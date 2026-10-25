package hub;

class KeyPlayer extends Thread
{
	@Override
	public void run()
	{
		BowlingCoach gg=new BowlingCoach();
		BattingCoach m=new BattingCoach();
		gg.setName("GautamGhambir");
		gg.setDaemon(true);
		gg.start();
		m.setName("Martin");
		m.setDaemon(true);
		m.start();
	
		try
		{
		System.out.println(getName()+" leaves the Hotel");
		Thread.sleep(1000);
		System.out.println(getName()+" reached the stadium");
		Thread.sleep(1000);
		System.out.println(getName()+" Started to practice");
		Thread.sleep(1000);
		System.out.println(getName()+" Continued to practice");
		Thread.sleep(1000);
		System.out.println(getName()+" Reached Hotel");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class BowlingCoach extends Thread
{
	@Override
	public void run()
	{
		while(true)
		{
		try
		{
		System.out.println(getName()+" leaves the Hotel");
		Thread.sleep(1000);
		System.out.println(getName()+" reached the stadium");
		Thread.sleep(1000);
		System.out.println(getName()+" Started to Help");
		Thread.sleep(1000);
		System.out.println(getName()+" Continued to Help");
		Thread.sleep(1000);
		System.out.println(getName()+" Reached Hotel");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	}
}
class BattingCoach extends Thread
{
	@Override
	public void run()
	{
		while(true)
		{
		try
		{
		System.out.println(getName()+" leaves the Hotel");
		Thread.sleep(1000);
		System.out.println(getName()+" reached the stadium");
		Thread.sleep(1000);
		System.out.println(getName()+" Started to Help");
		Thread.sleep(1000);
		System.out.println(getName()+" Continued to Help");
		Thread.sleep(1000);
		System.out.println(getName()+" Reached Hotel");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	 }
  }
}
public class doraemonThread {
	public static void main(String[] args)
	{
		KeyPlayer vk=new KeyPlayer();
		
		vk.setName("ViratKohli");
		vk.start();
		
	}
}
