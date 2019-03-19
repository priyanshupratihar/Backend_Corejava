package com.EmployeeManagement.java;

import java.io.ByteArrayInputStream;
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Practice {
	
	
	static boolean b1;
	public int a;
	public static int b;
	public static void main(String[] args)
	{ 
		
		Practice r1 = new Practice(), r2 = new Practice(); 
		System.out.println(r1.a);
		r1.a++; r1.b++; 
	    System.out.println(r1.a+", "+r1.b+", "+r2.a+", "+r2.b); 
		System.out.println("***************");
		Calendar calendar = new GregorianCalendar(); 
		int month= calendar.get(Calendar.DATE);
		System.out.println(month); 
		
		System.out.println("String "+new Integer("4")+5); 
		System.out.println(5.45+"3,5");
		
		 String str = "Good Morning";  
		 String str1=str.concat("Hello"); 
		 System.out.println(str1);
		 
		 System.out.println(5+4+"String"+7+1); 
		 
		 try{   System.out.println("String "+1/0); }
		 catch(ArithmeticException ae)
		 { 
			 System.out.println("Catch block");
		}
		 
		double x = 0, y = 5.98; 
		 try { 
			 System.out.println( (y/x) );
			 } catch (Exception e) 
		 {  
				 System.out.println("Exception");
		 } catch (Throwable t)
		 { 
			 System.out.println("Error"); 
		 }
		 
		// Number n = new Integer(12); 
		 //Double d = (double)n; 
		 //System.out.println(d);
		 
		 String obj  = "abc"; 
		 byte b[] = obj.getBytes();   
		 ByteArrayInputStream obj1 = new ByteArrayInputStream(b);  
		 System.out.println((char)obj1.read());
		 
		 List<Integer> list = new ArrayList<Integer>(); 
		 list.add(9); 
		 list.add(8); 
		 list.add(2);  
		 list.add(1);  
		 Collections.reverse(list); 
		 Collections.sort(list); 
		 Iterator<Integer> itr = list.iterator(); 
		 //Collections.shuffle(list); 
		 while(itr.hasNext()){  
			 System.out.println(itr.next());
		 }
		 
		 
		 boolean[] array = new boolean[1];  
		 boolean b2=true;   
		 System.out.print(b1+","); 
		 System.out.print(array[0]+","); 
		 System.out.print(b2);
		 
		 
		 int[][] a1 = {{1,2},{3,4,5},{6,7,8,9,10},{}};   
		 System.out.print(a1.length);
		 
		 
		
	}
	
	 private static int f1 = 1;
	 private int f2 = 2;  
	 void m1(int p1, final int p2) 
	 {  
		 int l1 = 5;  
		 final int l2 = 6; 
		 Object x = new Object();
		 {    
		 int a = f1;  // 1 
		 int b = f2;  // 2    
		 int c = p1;  // 3   
		 int d = p2;  // 4   
		 int e = l1;  // 5   
		 int f = l2;  // 6 
		 }
	 }
}
	 


