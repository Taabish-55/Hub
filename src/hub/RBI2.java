package hub;

import java.util.Scanner;

class incorrectPinInput extends Exception
{
	@Override
	public String getMessage()
	{
		return "Invalid Pin Entered";
	}
}
class ATM2
{
	int pin=5000;
	int enteredPin;
	int balance=10000;
	void AcceptInput()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the PIN");
		enteredPin=in.nextInt();
		
	}
	void VerifyPin() throws Exception
	{
		if(pin==enteredPin)
		{
			System.out.println("The Balance is: "+balance);
		}
		else
		{
			incorrectPinInput p=new incorrectPinInput();
			throw p;
		}
	}
}
class BANK2
{
	void init()
	{
	ATM2 atm=new ATM2();
	try {
	atm.AcceptInput();
	atm.VerifyPin();
	}
	catch(Exception e1)
	{
		System.out.println(e1.getMessage());
		try {
		atm.AcceptInput();
		atm.VerifyPin();
		}
		catch(Exception e2)
		{
			System.out.println(e2.getMessage());
			try {
			atm.AcceptInput();
			atm.VerifyPin();
			}
			catch(Exception e3)
			{
				System.out.println("CARD BLOCKED !!! GO TO YOUR NEAREST BAMK TO RESOLVE IT");
			}
		}
	}
	}
}
public class RBI2 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		BANK2 bob=new BANK2();
		bob.init();
	}
}
