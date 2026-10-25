package hub;
import java.util.*;
public class pit {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		ArrayDeque ad=new ArrayDeque();
		ad.add(1);
		ad.add(33);
		ad.add(23);
		ad.add(56);
		ad.add(88);
		
		Iterator cursor=ad.iterator();
		while(cursor.hasNext())
		{
			System.out.println(cursor.next());
		}
	}
}
