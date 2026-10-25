package hub;
import java.util.*;
class Employ
{
	private int id;
	private String name;
	private double sal;
	public Employ(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setsal(double sal)
	{
		this.sal=sal;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public double getsal()
	{
		return sal;
	}
	@Override
	public String toString()
	{
		return "Employee: "+name;
	}
}
public class knight_comparator {
	public static void main(String[] args)
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n=in.nextInt();
		TreeSet<Employ> ts=null;
		
		
		System.out.println("Sort option: \n 1. Based on id \n 2. Based on name \n 3. Based on salary ");
		System.out.println("Enter the choice 1 or 2 or 3");
		int choice =in.nextInt();
		if(choice==1)
		{
			ts=new TreeSet<Employ>((o1,o2)-> Integer.valueOf(o1.getid()).compareTo(o2.getid()));
		}
		else if(choice==2)
		{
			ts=new TreeSet<Employ>((o1,o2)-> o1.getname().compareTo(o2.getname()));
		}
		else
		{
			ts=new TreeSet<Employ>((o1,o2)-> Double.valueOf(o1.getsal()).compareTo(o2.getsal()));
		}
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the data in CSV Format");
			String data=in.nextLine();
			String[] dataArray=data.split(",");
			
			ts.add(new Employ(Integer.parseInt(dataArray[0]),dataArray[1],Double.parseDouble(dataArray[2])));
		}
		
		
		System.out.println(ts);
	}

}
