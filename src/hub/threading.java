package hub;
import java.util.*;
class SingleRun extends Thread
{
	public void run()
	{
		if(getName().equals("Nums")) {
		printnum();
		}
		else if(getName().equals("Chars"))
		{
		printchar();
		}
		else {
		addition();
		}
	}
		void printnum()
		 {
			 System.out.println(getName()+" Execution Started");

			 for(int i=0;i<=9;i++)
				{
					System.out.println(i);
					try {
					Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
				}
			}
			 System.out.println(getName()+" Execution Terminated");
		 }
		void printchar()
		 {
			 System.out.println(getName()+" Execution Started");

			 for(char ch='A';ch<='Z';ch++)
				{
					System.out.println(ch);
					try {
					Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			 System.out.println(getName()+" Execution Terminated");
		 }
		void addition()
		{
			 System.out.println(getName()+" Execution Started");
				Scanner in=new Scanner(System.in);
				int a=in.nextInt();
				int b=in.nextInt();
				System.out.println(a+b);
				System.out.println(getName()+" Execution Terminated");
		}	
}
	
public class threading {
	
	public static void main(String[] args)
	{
		 SingleRun sr1=new SingleRun();
		 SingleRun sr2=new SingleRun();
		 SingleRun sr3=new SingleRun();
		 
		sr1.setName("Adder"); 
		sr1.start();
		sr2.setName("Chars");
		sr2.start();
		sr3.setName("Nums");
		sr3.start();
		

	}
}
