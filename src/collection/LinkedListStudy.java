package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
		LinkedList<Object> ll=new LinkedList<>();
		
		ll.add("Pune");
		ll.add("Pune");
		ll.add(null);
		ll.add(null);
		ll.add(123);
		ll.add('M');
		ll.add(true);
		ll.add(12.3456f);
		
		System.out.println(ll);
		
		System.out.println(ll.add("India"));
		ll.addFirst("MH");
		ll.addLast("Harshad");
		System.out.println(ll);
		
		Object lla = ll.clone();
		System.out.println(lla);
		
		System.out.println(ll.contains('M'));
		
		System.out.println(ll.element()); // element() method gives 1st element of the list
		
		System.out.println(ll.equals(lla));
		
		System.out.println(ll.get(4));
		System.out.println(ll.getFirst());  // getfirst() amd element() are same method
		System.out.println(ll.getLast());
		
		System.out.println(ll.indexOf(true));
		System.out.println(ll.lastIndexOf(12.3456f));
		
		System.out.println(ll.isEmpty());
		
		System.out.println(ll.offer("mumbai")); //offer()method is adding element in the last of the list
		System.out.println(ll);
		
		System.out.println(ll.offerFirst("Katraj"));
		System.out.println(ll);
		
		System.out.println(ll.offerLast("New Mumbai"));
		System.out.println(ll);
		
		System.out.println(ll.peek());  // peek() method shows 1st element of the list
		System.out.println(ll);
		
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll);
		
		System.out.println(ll.poll()); // poll() methode remove 1st element of the list
		System.out.println(ll);
		
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
		System.out.println(ll.pop()); // pop() method removes 1st element of the list.. this same as poll()
		System.out.println(ll);
		
		ll.push("Bharat");  // push() methode use to insert element in the 1st.
		System.out.println(ll);
		
		System.out.println(ll.size());
		
		System.out.println(ll.removeFirstOccurrence("Bharat"));
		System.out.println(ll);
		
	 //===================================================================
		// LinkedList Traversing
		//1) for loop  //2) for each loop  3) Iterator  4)List Iterator
		
		System.out.println("=============for loop=====================");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		
		System.out.println("=============for each loop=====================");
		for(Object a:ll)
		{
			System.out.println(a);
		}
		
		
		System.out.println("=============Iterator=====================");
		Iterator<Object> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("=============List Iterator=====================");
        ListIterator<Object> li = ll.listIterator();
        while(li.hasNext())
        {
        	System.out.println(li.next());
        }

	


	}

}
