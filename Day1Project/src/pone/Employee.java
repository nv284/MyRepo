package pone;
class Dept
{
	public Dept()
	{
		System.out.println(" Dept construtor");
	}
}

public class Employee {
int empid;
String name;
String address;
static String compName = "Amdocs" ;
static void change()
{
	compName="Amdocs_wonderful";
}
static {
	System.out.println("Printing static block ");
}
public Employee(int empid, String name, String address)
{ this.empid=empid;
	this.name=name;
	this.address= address;
}
 void display()
 {
	 String city;
	 System.out.println(empid + "  "+name+"   "+address+"  "+compName);
 }
 //System.out.println(city);
 public static void main(String[] args)
 {Employee .change();
	 Employee e = new Employee(123,"Rajeev" ,"Mumbai");
	 Employee e1 = new Employee(124,"Rajeev" ,"Mumbai");
	 Employee e2= new Employee(125,"Rajeev" ,"Mumbai");
	 Employee e3= new Employee(126,"Rajeev" ,"Mumbai");
	 e.display();e1.display();e2.display();e3.display();
	 Dept d= new Dept();
 }
 
}
