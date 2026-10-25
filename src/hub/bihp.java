package hub;

import java.util.ArrayList;
import java.util.Collections;

public class bihp {
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(22);
		al.add(34);
		al.add(45);
		al.add(55);
		al.add(56);
		al.add(65);
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(32);
		
		System.out.println(al);
		System.out.println(Collections.frequency(al,12));
		
	}
}
