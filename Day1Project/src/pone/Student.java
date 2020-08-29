package pone;

public class Student {
int id ; String name ; int fee;
Student(int i , String n)
{
	id= i;
	name= n;}
Student(int i , String n , int f )
{
	id=i; name= n ;fee=f;}
void show() {
System.out.println(id+"   "+name+"   " +fee);}

public static void main(String[] args) {
	Student s= new Student(123, "karan");
	Student s1= new Student(122, "ketan", 50000);
	s.show();
	s1.show();
}}
