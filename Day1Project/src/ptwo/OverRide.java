package ptwo;
class  Run
{ final int x =20;
	void call()
	{
		System.out.println("print");
	}
}
public class  OverRide  extends Run{
	void call()
	{
		System.out.println("print again");
	}
public static void main(String[] args)
{
	OverRide r= new OverRide();
	r.call();
}
}
