package com.tnsif.multithreading;

public class UsingRunnablemain {

	public static void main(String[] args) {
		
		UsingRunnable ob1 = new UsingRunnable(10, "Thread running1");
		UsingRunnable ob2 = new UsingRunnable(10, "Thread running2");
		
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		
		t1.start();
		t2.start();
	}

}
