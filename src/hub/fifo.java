package hub;
import java.util.*;
public class fifo {
public static void main(String[] args)
{
	ArrayList al=new ArrayList();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	ListIterator cursor=al.listIterator(al.size());
	while(cursor.hasPrevious())
	{
		System.out.println(cursor.previous());
	}
}
}
