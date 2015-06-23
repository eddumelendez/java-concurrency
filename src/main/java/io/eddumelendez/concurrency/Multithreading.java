package io.eddumelendez.concurrency;

/**
 * Created by eddumelendez on 6/19/15.
 */
public class Multithreading {

	private static class MyThread extends Thread {
		public MyThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		MyThread myThread = new MyThread("myThread");
		myThread.run(); //switch to start() method to see the difference
	}
}
