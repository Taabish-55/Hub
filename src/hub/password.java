package hub;
import java.util.*;
public class password {
public static boolean ddd(String s)
{
	boolean hasUpper=false;
	boolean hasLower=false;
	boolean hasDigit=false;
	boolean hasSpecial=false;
	boolean hasSpace=false;
	
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='A' && ch<='Z')
		{
			hasUpper=true;
		}
		else if(ch>='a' && ch<='z')
		{
			hasLower=true;
		}
		else if(ch>=48 && ch<=57)
		{
			hasDigit=true;
		}
		else if(ch==' ')
		{
			hasSpace=true;
		}
		else
		{
			hasSpecial=true;
		}
	}
	return hasUpper && hasLower && hasDigit && hasSpecial && !hasSpace;
}
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Password");
		String s=in.nextLine();
		if(ddd(s))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
