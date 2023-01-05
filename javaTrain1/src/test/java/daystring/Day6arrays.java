package daystring;

public class Day6arrays {

	public static void main(String[] args) {
		
	
		
		 String[] mobilenum = { "647572", "65743","64863"};
		 
		 for(String o : mobilenum)
		 {
			 System.out.println(o);
		 }
		
		
		String[] members = {"ramesh","janani","kanish","deepi"};
		
		for(String p : members)
		{
			System.out.println(p);
		}
		
		for(int i=0; i<members.length; i++)
		{
			System.out.println(members[i]);
		}
		String[]girls = {"kani","deepi","san","kar",};
		for(String q : girls)
		{
			System.out.println(q);
		}
		
		int []numbers = {1,2,3,4,5};
		
		for(int h : numbers)
		{
			System.out.println(h);
		}
		
		
		
		// split
		String name = "what are you doing";
		System.out.println(name);
		String []names = { " what", "are", "u" ,"doing"};
		
		
		for( String g : names) {
			System.out.println(g);
		}
		
		for( int f = 0;f<names.length;f++)
		{
			System.out.println(names[f]);
		}
		
		String[] title = name.split(" ");
		for(String d : title)
		{
			System.out.println(d);
		}
		String sur ="sankar";
		if (sur.contains("kar"))
		{
			System.out.println(" It contain kar");
			
		}
		
		else {
			System.out.println("It does not contain kar");
		}
		
		String variety = "mango ia  a fruit";
		if(variety.contains("not"))
		{
			System.out.println("It contains");
		}
		
		else {
			System.out.println("its not");
		}
		
		
		
	}

}
