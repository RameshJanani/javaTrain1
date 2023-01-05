package coLLecTions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetInterFace {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		h.add( " Tcs ");
		h.add(" CTS");
		h.add("HCL");
		h.add(123);
		h.add(567);
		h.add(" $%&*");
		h.add(567);
	    System.out.println(h.size());
		for(Object f :h)
		{
			System.out.println(f);
		}
		 HashSet<Integer> n = new  HashSet<Integer>();
		 n.add(12);
		 n.add(90);
		 HashSet<Integer> n1 = new HashSet<Integer>();
		 n1.addAll(n);
		for( Object n2 : n1) {
			System.out.println(n2);
		}
		 System.out.println("*************");
		 LinkedHashSet h1 = new LinkedHashSet();
		
		h1.add("  one ");
		h1.add(" two");
		h1.add("three");
		h1.add("four");
		System.out.println(h1.size());
		
		for(Object s : h1)
			System.out.println(s);
		
		Iterator i = h.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
		
		

	}

}
