package ptwo;
class Address
{
int s_no;
String city;
String state;
int pin;
public Address(int s_no, String city , String state ,int pin) {
	// TODO Auto-generated constructor stub
}
}

public class Sudent {
String name ;
Address ad ;
public Sudent(String name , Address ad)
{
	this.name= name;
	this.ad=ad;
}
void disp()
{
	System.out.println(name+"   "+ad);
}
public static void main(String [] arg)
{ Address a= new Address(123,"mum", "state",122334);
	Sudent s= new Sudent("Jugal" ,a);
s.disp();
	
}
}
