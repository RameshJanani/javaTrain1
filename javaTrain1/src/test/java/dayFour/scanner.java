package dayFour;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("before overriding the hard core is");
		
		int i=sc.nextInt();
	
		System.out.println("enter the no. which needs to be overriden");
		
		int j =sc.nextInt();
		System.out.println("after overriding the user input is" + j);
		
		
		int multiplier;
		
		System.out.println(" enter the no. need to multiply");
		
		 multiplier = sc .nextInt();
		
		
		for( int p = 1; p <= 13; p++)
		
		{
			System.out.println(multiplier +"*" + p + "= "+multiplier * p);
		}
		
		
		 
		 
		
		
		
		
	}

}
