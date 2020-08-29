package ptwo; 
 
abstract class Abstract1{
	abstract void test();
}
class Abstract_Demo extends Abstract1{
    void test()
    {
    	System.out.println("in the system test");
    }
    public static void main(String[] args)
    {
    	Abstract_Demo a= new Abstract_Demo();
    	a.test();
    }
}
