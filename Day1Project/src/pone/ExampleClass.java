package pone;

class NewClass
{
	NewClass(int x)
	{
		System.out.print("print x " +x);
	}
}
public class ExampleClass  extends NewClass{
	ExampleClass(int x)
	{ super(x)
;		System.out.println("Value of a " +x);
	}
	public static void main(String[] args)
	{
		ExampleClass e= new ExampleClass(4000);
	}

}
