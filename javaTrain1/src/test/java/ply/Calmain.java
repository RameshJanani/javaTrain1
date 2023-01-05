package ply;

public class Calmain {

	public static void main(String[] args) {
	
		Calmethod m = new Calmethod();
		

		System.out.println( m.sum(10, 150,25, 60));
		
		
		System.out.println(m.sum(18, 9, 6));
		
		
		m.setAccount("1234");
		
		
		System.out.println(m.getAccount());
		
		m.setPhonenumber("1234567");
		
		System.out.println(m.getPhonenumber());
		
                      System.out.println(m.sum(9, 3));
		
		
	}

}
