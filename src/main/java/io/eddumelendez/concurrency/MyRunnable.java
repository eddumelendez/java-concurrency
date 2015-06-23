package io.eddumelendez.concurrency;

/**
 * Created by eddumelendez on 6/19/15.
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("name " + Thread.currentThread().getName());
		System.out.println("id " + Thread.currentThread().getId());
		System.out.println("priority " + Thread.currentThread().getPriority());
		System.out.println("thread group " + Thread.currentThread().getThreadGroup());
		System.out.println("state " + Thread.currentThread().getState());
	}

	public static void main(String[] args) {
		System.out.println("name " + Thread.currentThread().getName());
		System.out.println("state " + Thread.currentThread().getState());
		Thread thread = new Thread(new MyRunnable(), "myRunnable");
		System.out.println("state " + thread.getState());
		thread.start();
	}
}
