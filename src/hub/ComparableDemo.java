package hub;
import java.util.*;
class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private double sal;
	public Employee(int id,String name,double sal)
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
		return "ename: "+name;
	}
	@Override
	public int compareTo(Employee e2)
	{
		return Integer.valueOf(this.getid()).compareTo(e2.getid());
	}
}

public class ComparableDemo {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n=in.nextInt();
		in.nextLine();
		LinkedList<Employee> ll=new LinkedList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the data in CSV Format");
			String data=in.nextLine();// 1,arun,2345
			String[] ar=data.split(",");
			ll.add(new Employee(Integer.parseInt(ar[0]),ar[1],Double.parseDouble(ar[2])));
			
		}
		Collections.sort(ll);
		System.out.println(ll);
		
	}
}
