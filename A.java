import java.util.Scanner;
class A 
{
 int a ;
int b;
  private int c;

void s (int x , int y , int z)

{
  a= x;
  b= y ;
  c= z ;
}

}

 class B extends A
{
  int total ;
 void sum ()
{
 int num;
System.out.println("enter no");
Scanner in = new Scanner(System.in);
     
      a = in.nextInt();
      b= in.nextInt();
   total=a+b;
 
}

}


class access
{
public static void main(String args[])
B b = new B();
b.sum();
System.out.println("sum =" + sum());
}