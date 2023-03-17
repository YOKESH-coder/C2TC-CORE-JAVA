package com.tnsif.multithreading;

public class UsingRunnable implements Runnable{
	
	int n;
	String msg;
	
	public UsingRunnable(int n, String msg) {
		this.n = n;
		this.msg = msg;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				System.out.println(msg+i);
				Thread.sleep(4000);
			}
			catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}
			
		}
		
	}
	
	

}
