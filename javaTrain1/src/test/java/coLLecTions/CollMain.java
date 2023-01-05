package coLLecTions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.collection;
public class CollMain {
	

	public static void main(String[] args) {
		
		
		ArrayList subjects = new ArrayList();
		subjects.add("English");
		subjects.add("Tamil");
		subjects.add("Maths");
		subjects.add("Science");
		subjects.add("History");
		subjects.add("geo");
		
		ArrayList marks = new ArrayList();
		marks.add(70);
		marks.add(72);
		marks.add(75);
		marks.add(85);
		marks.add(75);
		marks.add(78);
		System.out.println("*************");
		ArrayList<String > sub = new ArrayList< String >(); 
		sub.add("phy");
		sub.add("chem");
		sub.add("bio");
		for(String g : sub)
		{
			System.out.println(g);
		}
		ArrayList<Integer> mar = new ArrayList<Integer>();
		mar.add(65);
		mar.add(70);
		mar.add(80);
		for(Integer m : mar) {
			System.out.println(m);
		}
		
		for (int a =0; a< sub.size();a++)
		{
			for (int b = 0; b < mar.size(); b++){
			System.out.println("The marks for " + sub.get(a)+ " is " + mar.get(a));	
			}
		}
		System.out.println("*******");
		LinkedList subjects1 = new LinkedList();
		subjects1.add("English");
		subjects1.add("Tamil");
		subjects1.add("Maths");
		subjects1.add("Science");
		subjects1.add("History");
		subjects1.add("geo");
		
		for( int i=0; i<subjects.size();i++)
		{
			for(int j = 0; j<marks.size();j++)
			{	
			System.out.println("the marks for " + subjects.get(j)+ " is " + marks.get(i));	
				}}
		System.out.println(marks.size());
		System.out.println(subjects.size());
		
		System.out.println(marks.get(0));
	
		System.out.println(subjects.get(5));
		System.out.println( "***************");
		System.out.println( subjects1.size());
		
		for(Object c: subjects1)
		{
			System.out.println(c);
		}
		
		System.out.println(subjects.get(1));
		
		subjects.add(1, " computer ");
		
		System.out.println( subjects.get(1));
		
		System.out.println( subjects.get(0));
	System.out.println( subjects.size());
	System.out.println(subjects1.size());
	
	}
	
	}

