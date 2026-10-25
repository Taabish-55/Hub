package hub;
import java.util.*;
class OS
{
	private String name;
	private int size;
	OS(String name,int size)
	{
		this.name=name;
		this.size=size;
	}
	public String getname()
	{
		return name;
	}
	public int getsize()
	{
		return size;
	}
}
class Charger
{
	private String brand;
	private float voltage;
	Charger(String brand,float voltage)
	{
		this.brand=brand;
		this.voltage=voltage;
	}
	public String getbrand()
	{
		return brand;
	}
	public float getvoltage()
	{
		return voltage;
	}
}
class Mobile
{
	OS os=new OS("ANDROID",15);
	
	void hasA(Charger c)
	{
		System.out.println(c.getbrand());
		System.out.println(c.getvoltage());
	}
}
public class dayaggandcompo {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Charger c=new Charger("SAMSUNG",15.4f);
		
		Mobile m=new Mobile();
		System.out.println(m.os.getname());
		System.out.println(m.os.getsize());
		m.hasA(c);
		m=null;
		System.out.println(c.getbrand());
		System.out.println(c.getvoltage());
	}
}
