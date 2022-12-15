package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) 
	{
		LinkedHashSet<Object> lhs=new LinkedHashSet<>();
		
		lhs.add("Pune");
		lhs.add("Pune");
		lhs.add(null);
		lhs.add(null);
		lhs.add(123);
		lhs.add('A');
		lhs.add(123.4567f);
		lhs.add(true);
		
		System.out.println(lhs);
		
		Object lhs1 = lhs.clone();
		System.out.println(lhs1);
		
		System.out.println(lhs.equals(lhs1));
		
		System.out.println(lhs.contains(123));
		System.out.println(lhs.contains(null));
		
		System.out.println(lhs.isEmpty());
		
		System.out.println(lhs.size());
		
		System.out.println(lhs.remove(null));
		System.out.println(lhs);
		
		// lhs.clear();
		
	//==========================================
		//LinkedHashSet Traversing
		// 1) for each loop      2) Iterator
		
		System.out.println("========foe each loop==========");
		
		for(Object l:lhs)
		{
			System.out.println(l);
		}

		
		System.out.println("========Iterator==========");
		
		Iterator<Object> it = lhs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		

	}

}
