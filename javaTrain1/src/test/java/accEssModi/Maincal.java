package accEssModi;

import inheritance.base;
import inheritance.iphone;
import ply.Calmethod;

public class Maincal {

	public static void main(String[] args) {
		

		Calmethod b = new Calmethod();
		
		iphone i = new iphone();
		
		base a = new base();
	
		a.calling();
		  i.facetime();

		
		i.switchon();
		   
		a.swichoff();
		
		a.switchon();
		
		Method acc = new Method();
		
		System.out.println(acc.sum(10, 30));
		
		acc.o(20);
	//acc.j = 12;
		
		acc.equals(0);
		
	}

}
