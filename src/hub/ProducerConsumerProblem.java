package hub;
import java.util.*;
class Queue
{
	int data;
	boolean isDataPresent=false;
	synchronized public void setData(int data)
	{
		if(isDataPresent==false)
		{
		this.data=data;
		isDataPresent=true;
		notify();
		}
		else
		{
			try
			{
			wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" produced the data : "+data);
		try
		{
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{m,
			e.printStackTrace();
		}
	}
	synchronized public void getData()
	{
		if(isDataPresent ==true)
		{
		System.out.println(Thread.currentThread().getName()+" consumed the data : "+data);
		isDataPresent=false;
		notify();
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
		else {
			try
			{
			wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Producer extends Thread
{
	Queue q;
	public Producer(Queue q)
	{
		this.q=q;
	}
	@Override
	public void run()
	{
		int i=1;
		while(true)
		{
		q.setData(i);
		i++;
		}
	}
}
class Consumer extends Thread
{
	Queue q;
	public Consumer(Queue q)
	{
		this.q=q;
	}
	@Override
	public void run()
	{
		while(true)
		{
		q.getData();
		}
	}
}
public class ProducerConsumerProblem {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Queue q=new Queue();
		
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		p.setName("PRODUCER");
		c.setName("CONSUMER");
		
		p.start();
		c.start();
	}
}
