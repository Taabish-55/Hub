package hub;
import java.util.*;
class Employe implements Comparable<Employe>
{
	private int eId;
	private String eName;
	private double eSal;
	public Employe(int eId,String eName,Double eSal)
	{
		this.eId=eId;
		this.eName=eName;
		this.eSal=eSal;
	}
	public void setId(int eId)
	{
		this.eId=eId;
	}
	public void setName(String eName)
	{
		this.eName=eName;
	}
	public void eSal(double eSal)
	{
		this.eSal=eSal;
	}
	public int getId()
	{
		return eId;
	}
	public String getName()
	{
		return eName;
	}
	public double getSal()
	{
		return eSal;
	}
	@Override
	public String toString()
	{
		return "eName: "+eName;
	}
	@Override
	public int compareTo(Employe e2) {
		 
		return Integer.valueOf(this.getId()).compareTo(e2.getId());
		
	}
}
public class comparable {
	public static void main(String[] args)
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of Employees");
		int n=in.nextInt();
		in.nextLine();
		LinkedList<Employe> ll=new LinkedList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the data in CSV format");
		String data=in.nextLine(); //1,Arun,10000 
		String[] dataArray=data.split(",");
		ll.add(new Employe(Integer.parseInt(dataArray[0]),dataArray[1],Double.parseDouble(dataArray[2])));
		}
		
		Collections.sort(ll);
		System.out.println(ll);
	}
}
