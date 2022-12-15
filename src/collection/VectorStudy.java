package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<>();
		
		v.add(12);
		v.add(12);
		v.add(null);
		v.add(null);
		v.add(1);
		v.add(123);
		
		System.out.println(v);
	
		System.out.println(v.capacity()); // default capacity  of vector is 10
		System.out.println(v.size());
		
		 Object v1 = v.clone();
		System.out.println(v1);
		
		System.out.println(v.contains(1));
		System.out.println(v.contains(0));
		System.out.println(v.containsAll(v));
		
		System.out.println(v.equals(v1));
		
		System.out.println(v.indexOf(1)); // in this methode passing object and get index no.
		System.out.println(v.indexOf(null, 3));
		System.out.println(v.lastIndexOf(12));
		
		System.out.println(v.isEmpty());
		
//		System.out.println(v.remove(null)); // in this method remove null from list
//		System.out.println(v);
//		
//		System.out.println(v.removeElement(1)); // same method as remove()
//		System.out.println(v);
		 
		System.out.println(v.toString());
		
		System.out.println(v.elementAt(3));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		System.out.println(v.get(4));
		
		v.set(1, 45);
		System.out.println(v);
		
	//	v.clear();
	//	System.out.println(v);
	
   //==============================================================================
		// Vector traversing
		//1)for loop  2) for each loop  3) Iterator  4) list Iterator  5) enumeration
		
		System.out.println("=============for loop==============");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		
		System.out.println("=============for each loop==============");
	     for(Integer f:v)
	     {
	    	 System.out.println(f);
	     }
		
	     
		System.out.println("=============Iterator==============");
		    Iterator<Integer> it = v.iterator();
		    while(it.hasNext())
		    {
		    	System.out.println(it.next());
		    }

		    
	    System.out.println("=============List Iterator==============");
	       ListIterator<Integer> li = v.listIterator();
           while(li.hasNext())
           {
        	   System.out.println(li.next());
           }
 
   		System.out.println("=============Enumeration==============");
   		  Enumeration<Integer> el = v.elements();
   		  while(el.hasMoreElements())
   		  {
   			  System.out.println(el.nextElement());
   		  }

		
		
		

	}

}
