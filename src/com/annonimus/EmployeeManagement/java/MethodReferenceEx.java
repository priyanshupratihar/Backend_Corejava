package com.annonimus.EmployeeManagement.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceEx {

	public static void main(String[] args) {
		String[] countriesArr= {"india","australia","japan","usa"};
		Collection<String> countries=Arrays.asList(countriesArr);
		System.out.println(countries.stream().count());
		
		//Approach #1
		System.out.println("for each loop");
		for(String country:countries) 
		{
			System.out.println(country);
		}
		//Approach #2
		System.out.println("\nIterator");
		Iterator<String> itr=countries.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Approach #3
		System.out.println("for each method");
		//countries.forEach((String item)->System.out.println(item));
		countries.forEach(item->MethodReferenceEx.displayItem(item));
		//
		MethodReferenceEx mr= new MethodReferenceEx();
		countries.forEach(MethodReferenceEx::displayItem);
		//countries.forEach(mr::displayItem);   for non-static method
		
		Supplier<List<String>> createList = () -> {return new ArrayList<String>();};
		List<String> cityList=createList.get();
		System.out.println(cityList);
		
		//mothod refference example to create ArrayList(invoking constructor)
		Supplier<List<String>> createList1 = ArrayList::new;
		List<String> cityList1=createList.get();
		System.out.println(cityList);
	}
	
	public static void displayItem(String item) {
		System.out.println(item);
	}

}
