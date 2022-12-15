package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy1 {

	public static void main(String[] args) 
	{
	  ArrayList<Object> al=new ArrayList<>();
	   
	  al.add("Pune");
	  al.add(123);
	  al.add("Pune");
	  al.add(null);
	  al.add(null);
	  al.add(123.456f);
	  al.add('A');
	  al.add(true);
	  
	  System.out.println(al);
	  
	  al.add("Katraj");
	  System.out.println(al);
	  
	//  al.clear();
	//  System.out.println(al);
	  
	  Object al1 = al.clone();  // clone() create a duplicate list
	  System.out.println(al1);
	  
	  System.out.println(al.contains('A')); 
	  
	  System.out.println(al.isEmpty());
	  
	  System.out.println(al.equals(al1)); 
	  
	  System.out.println(al.get(0));
	  System.out.println(al.get(5)); // its works like charAt() method of string
	  
	  System.out.println(al.indexOf('A'));
	  
	  System.out.println(al.size());  // size() gives lenght of the list
	  
	  System.out.println(al.remove(1));
	  System.out.println(al);
	  
	 System.out.println(al.remove(true));
	 System.out.println(al);
	 
	 System.out.println(al.set(1, "Hello"));
	 System.out.println(al);
	 
	 System.out.println(al.lastIndexOf("Katraj"));
	 
	// System.out.println(al.removeAll(al)); // removeall()method works like clear() method
	// System.out.println(al);
	 
	 
	 ArrayList<Integer> al2=new ArrayList<>();
	 al2.add(1);
	 al2.add(2);
	 al2.add(3);
	 al2.add(4);
	 al2.add(5);
	 al2.add(6);
	 
	 System.out.println(al2);
	 
	 
	//===================================================================
	 // Array list traversing by-->
	 //1) for loop    2) for each loop  3) Iterator    4) list Iterator
	 
	 System.out.println("===========for loop===========");
	 for(int i=0;i<=al.size()-1;i++)
	 {
		 System.out.println(al.get(i));
	 }
	 
	 
	 System.out.println("===========for each loop===========");
       for(Object a:al)
       {
    	   System.out.println(a);
       }
	  
       
       System.out.println("===========Iterator===========");
           Iterator<Object> it = al.iterator();
           while(it.hasNext())
           {
              System.out.println(it.next());
           }
	  
       System.out.println("===========List Iterator===========");
             ListIterator<Object> li = al.listIterator();  
             while(li.hasNext())
             {
            	 System.out.println(li.next());
             }
	  
	}

}
