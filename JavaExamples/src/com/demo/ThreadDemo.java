package com.demo;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+ " is running..");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		
			MyThread t1 = new MyThread();

		t1.start();
		try
		{
			t1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main thread");
		System.out.println(t1.isAlive());
		System.out.println(Thread.currentThread().getName());
		MyThread t2 = new MyThread();
		t2.start();
		System.out.println("Thread running.."+ Thread.currentThread().getName());
	System.out.println(t2.isAlive());
	}

}

