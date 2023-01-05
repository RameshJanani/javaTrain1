package excepTion;

import java.util.Scanner;

public class calmain {
	
	Scanner s = new Scanner(System.in);
	
	int add ( int c ,int j)
	
	
	{
		try {
			Scanner e = new Scanner(System.in);
			System.out.println( "enter the no.");
			c = e.nextInt();
			}
	catch( Exception f)
	{
		System.out.println( " enter the correct no. "+ f);
	}

		finally {
			System.out.println( "enter the number only");
		}
		
	try {
		 Scanner e1 = new Scanner (System.in);
		 System.out.println( "enter the second no,");
		j= e1.nextInt();	
	}
		
		catch(Exception e)
	{
			System.out.println( " entr the cirrect"+e);
	}
		
	finally {
		System.out.println( "enter the number only");
	}
	
	
		int f = c+j;
		System.out.println("the addition is"+ f);
		return f;
	}
	
	
	int diff (int g ,int a)
	{
		System.out.println("Enter the f1 no.");
		g=s.nextInt();
		System.out.println(" enter the 2nd no.");
		a = s.nextInt();

		int b = g - a;
		System.out.println("the subtraction is"+ b);
		return b;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
