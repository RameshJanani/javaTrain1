package coLLecTions;
 import java.util.HashMap;
 
public class MapInterface {

	public static void main(String[] args) {
		
     HashMap hm =  new HashMap (); 
     hm.put("Anand ", 01);
     hm.put("Banu", 02);
     hm.put("Chitra", 03);
     hm.put("Deepa", 04);
     hm.put("Ezhil", 05);
     hm.put("Ferin", 06);
     System.out.println(hm.get("Chitra"));
     System.out.println( hm.size());
    System.out.println();
     for ( Object f : hm.keySet())
     {
    	 System.out.println( "The Employee name " + " "+ f + " and  id is " +
    			 hm.get(f));
     }
      
    
	}

}
