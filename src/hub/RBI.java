package hub;
import java.util.*;
class PinInputMismatch extends Exception
{
	@Override
	public String getMessage()
	{
		return "Invalid Input Entered";
	}
}
class ATM
{
	Scanner in=new Scanner(System.in);
	int pin=7000;
	int enteredPin;
	int balance=10000;
	void acceptPin()
	{
		System.out.println("Enter the Pin");
	    enteredPin=in.nextInt();
	}
	void verifyPin() throws Exception
	{
		if(pin==enteredPin)
		{
			System.out.println("The balance is="+balance);
		}
		else {
			PinInputMismatch p=new PinInputMismatch();
			throw p;
		}
	}
}
class BANK
{
	void init()
	{
		ATM a=new ATM();
		try
		{
			a.acceptPin();
			a.verifyPin();
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
			try
			{
			a.acceptPin();
			a.verifyPin();
			}
			catch(Exception e2)
			{
				System.out.println(e2.getMessage());
				try
				{
				a.acceptPin();
				a.verifyPin();
				}
				catch(Exception e3)
				{
					System.err.println("CARD BLOCKED !!!! GO TO YOUR NEAREST BANK TO RESOLVE IT");
				}
			}
		}
	}
}
public class RBI
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		BANK b=new BANK();
		b.init();
	}
}