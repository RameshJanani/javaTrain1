package dayFour;



public class string {



	public static void main(String[] args) {
		
		String Firstname  = "Janani";
		String Middlename = "Ramesh";
		String Lastname = "Sankar";
		//concat
		String Fullname = null;
		
		Fullname = Firstname.concat(" " +Middlename);
		Fullname = Fullname.concat(" " +Lastname);
		
		System.out.println(Fullname);
		
		System.out.println(Fullname.charAt(12));
		System.out.println(Fullname.substring(3,10));
	
		System.out.println( " The character of index 10 is "+ Fullname.charAt(10));
		System.out.println(Fullname.substring(6));
		System.out.println( Fullname.charAt(9));
		System.out.println(Fullname.substring(16, 19));
		
		System.out.println(Fullname.charAt(5));
		System.out.println(Fullname.substring(15));
		System.out.println(Fullname.substring(4, 20));
		//charAt
		//substring
		
		String a = "   Howdy!";
		System.out.println( a.isEmpty());
		
		System.out.println(a);
		// trim
		String b = null;
		b= a.trim();
		
		System.out.println(b);
		
		System.out.println(b.length());
		
		String c = "happy";
		// length
		//index		System.out.println(c.length());
		
				System.out.println(c.charAt(2));
		
				System.out.println(c.substring(1));
				
				System.out.println(c.indexOf("y"));
		
				System.out.println(b.charAt(4));
		
				System.out.println(b.substring(2));
				System.out.println(c.substring(2, 3));
				System.out.println(c.length());
		
				System.out.println(c.indexOf("a"));
		
				System.out.println(b.indexOf("d"));
				
				System.out.println(c.indexOf("p", c.indexOf("p")+1));
				System.out.println(c.indexOf("p"));
				
				
		
				System.out.println(b.indexOf("w"));
				
				System.out.println(c.indexOf("h"));
			String e = " Whiteboard "	;
			System.out.println(e.length());
			System.out.println(e.indexOf("b"));
			System.out.println(e.indexOf("e"));
			System.out.println(e.charAt(6));
			String dob = " 23/10/1982 ";
			System.out.println(dob);
			System.out.println(dob.replace("/","-"));
			String lower = " well done ";
			String upper = " WELL DONE ";
			
			System.out.println(a.equals(b));
			System.out.println(lower.equalsIgnoreCase(upper));
				
			String f = "    Happy Holidays ";	
			System.out.println(f);
			String h = null;
			h = f.trim();
			System.out.println(h);
			
			
			
			
			
				
				
	}
	
	
}