package com.aarti1;

 class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getId()+"  Value  "+i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class MyThread {

	public static void main(String[] args) {
		Thread1 th = new Thread1();
				th.start();
				Thread1 th1 = new Thread1();
				th1.run();

	}

}
