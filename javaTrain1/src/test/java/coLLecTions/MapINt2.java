package coLLecTions;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapINt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm = new HashMap();
		hm.put("janai", 2);
		hm.put("kani", 3);
		hm.put("Deepi", 4);
		hm.put("Ramesh", 1);
		System.out.println(hm.size());
		System.out.println ( hm.get("kani"));
		
		HashMap< String,String> i = new HashMap< String,String> ();
		
		i.put(" Black", " white");
		LinkedHashMap hs = new LinkedHashMap();
		
		hs.put("subject", 001);
		
		
	}

}
