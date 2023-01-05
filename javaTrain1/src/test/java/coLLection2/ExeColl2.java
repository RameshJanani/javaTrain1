package coLLection2;

import java.util.ArrayList;
import java.util.Collections;



public class ExeColl2 {

	public static void main(String[] args) {
		 ArrayList subjects = new ArrayList();
		 
		subjects.add("Tamil");
		subjects.add("Maths");
		subjects.add("Science");
		subjects.add("History");
		subjects.add("geo");
		
		
		for (Object a : subjects) {
			System.out.println(a);
		}
		
		Collections.sort(subjects);
    Collections.reverse(subjects);
    for(Object b: subjects)
    {
    	System.out.println(b);
    }
	}
            
}
