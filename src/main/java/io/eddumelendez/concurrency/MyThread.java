package io.eddumelendez.concurrency;

/**
 * Created by eddumelendez on 6/19/15.
 */
public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

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
		MyThread thread = new MyThread("myOwnThread");
		System.out.println("state " + thread.getState());
		thread.start();
	}

}
