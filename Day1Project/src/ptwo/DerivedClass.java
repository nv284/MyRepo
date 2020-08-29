package ptwo;
class BaseClass
{
	int x= 240;
	void disp()
	{
		System.out.println("display vlaue of x  ="+ x);
	}
}

public class DerivedClass extends  BaseClass{
public static void main(String [] agrs ) {
	DerivedClass d= new DerivedClass();
d.disp();
}
}
