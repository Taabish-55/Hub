package hub;

public class methodsOfthreadclass {
public static void main(String[] args)
{
	Thread t=Thread.currentThread();
	t.setName("JUNE BATCH");
	System.out.println(t);
	System.out.println(t.getName());
	System.out.println(t.getId());
	System.out.println(t.getPriority());
	System.out.println(t.getThreadGroup());
}
}
