package com.aarti;

public class MyThread extends Thread {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.run();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	public void run()
	{
		System.out.println("run....");
	}

}
