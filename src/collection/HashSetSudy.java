package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSudy {

	public static void main(String[] args) 
	{
		HashSet<Object> hs=new HashSet<>();
		
		hs.add("One");
		System.out.println(hs.add(999));
		hs.add(null);
		hs.add(null);
		System.out.println(hs.add(999));
		hs.add('A');
		hs.add(true);
		
		System.out.println(hs);
		
		Object hs1 = hs.clone();
		System.out.println(hs1);
		
		System.out.println(hs.contains(999));
		
		System.out.println(hs.equals(hs1));
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.remove('A'));
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		//hs.clear();
		
	//==================================================
		// HashSet Traversiog
		// set does not supports traversing using for loop
		// using 2 option--> 1) for each loop  2) Iterator
		
		System.out.println("=========for each loop=========");
		
         for(Object h:hs)
         {
        	 System.out.println(h);
         }
         
 		System.out.println("=========Iterator=========");
        
 		Iterator<Object> it = hs.iterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
         
         
	}

}
