package com.aarti1;

class MyThread1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread run method called  ");
		System.out.println(Thread.currentThread().getId());
	}
}
public class ThreadClass {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread1());
				t1.start();
				System.out.println("Alive   " +t1.isAlive());
				System.out.println("Daemon " + t1.isDaemon());
				System.out.println("Interuppted  "+ t1.isInterrupted());
	}

}
