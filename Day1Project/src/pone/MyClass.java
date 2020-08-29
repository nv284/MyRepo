package pone;

public class MyClass {
String name;
int sal; String address; MyClass(){this("ABC");}
MyClass(String name){this(name,300);}
MyClass(String name , int sal){this(name, sal, "Mumbai");}
MyClass(String name, int sal, String address){this.name=name; this.sal=sal;this.address=address;}
void disp() {System.out.println("Name of emp " + name);System.out.println("Salary of emp  " +sal);
System.out.println("Address " + address);}
public static void main(String[] args)
{
	MyClass m = new MyClass();
	m.disp();
}

}

