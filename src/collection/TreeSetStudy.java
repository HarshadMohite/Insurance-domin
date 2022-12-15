package collection;

import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) 
	{
	    TreeSet<Object> ts=new TreeSet<>();
	    
	    ts.add(12);
	  //  ts.add("Pune"); -//---> ClassCastException  due to for TreeSet only pass homogenious values
	 //   ts.add(null);  // ---> In TreeSet null values are not Allowed so--> NullPointerException
	    ts.add(12);    //---> Dublicate values not allowed in TreeSet
	    ts.add(14);
	    ts.add(11);
	    ts.add(18);
	    ts.add(8);
	    
	    System.out.println(ts);
	    
	    System.out.println(ts.ceiling(12)); // gives same value if available in list
	    System.out.println(ts.ceiling(7));   // Gives near greater value available in list
	    System.out.println(ts.ceiling(16));  // Gives near greater value available in list 
	    System.out.println(ts.ceiling(20)); // Gives null returns Due to this value out of list
	    
	    System.out.println(ts);

	}

}
