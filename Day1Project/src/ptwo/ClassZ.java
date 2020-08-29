package ptwo;
class X 
{
	int x=10;
	void disp()
	{System.out.println("Class x method");}
}
class Y extends X
{
	
	void m2() {
		
	System.out.println("Class y method");
System.out.println("Git Examples");
	System.out.println(super.x);
	super.disp();}
	
}

public class ClassZ  extends Y{
public static void main(String [] args)
{
	ClassZ z= new ClassZ();
	//z.disp(); 
	z.m2();
}
}
