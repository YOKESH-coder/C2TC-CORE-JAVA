package com.tnsif.multithreading;

public class ChildThreadmain {

	public static void main(String[] args) {
		
		ChildThread ob1 = new ChildThread(5, "First thread is running");
		ChildThread ob2 = new ChildThread(7, "Second thread is running");
		
		ob1.start();
		ob2.start();

	}

}
