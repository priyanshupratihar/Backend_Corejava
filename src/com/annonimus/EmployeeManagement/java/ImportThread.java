package com.annonimus.EmployeeManagement.java;

import java.util.concurrent.Callable;

public class ImportThread implements Callable{

	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " -->Start Running thread");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			//throw new MyException();
		}
		System.out.println(Thread.currentThread().getName() + " -->Stop thread");
		return "Hello World";
	}

}
