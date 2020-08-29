package ptwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListClass {
	public static void main(String args[]){  
		  
		  ArrayList<String> list1=new ArrayList<String>();  
		  list1.add("Aman");  
		  list1.add("Zoya");  
		  list1.add("Babita");  
		  list1.add("Hema");  
		  Collections.sort(list1);  
		   //Traversing   
		  for(String fruit:list1)  
		    System.out.println(fruit);  
		      
		 System.out.println("Sorting numbers...");  
		   
		  List<Integer> list2=new ArrayList<Integer>();  
		  list2.add(21);  
		  list2.add(11);  
		  list2.add(51);  
		  list2.add(11);  
		    
		  Collections.sort(list2);  
		 
		  Iterator<String> it= list1.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
}}
