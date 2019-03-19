package com.assesment.collection.java;
import java.util.*;
public class ReadDataFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println(name);
		System.out.println("Enter Age");
		String age=sc.next();
		System.out.println(age);
		
		System.out.format("Name \t Age \n");
		System.out.format("%s \t %s \t %d");
	}

}
