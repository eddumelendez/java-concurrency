package io.eddumelendez.concurrency;

/**
 * Created by eddumelendez on 6/19/15.
 */
public class InterruptExample implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(Long.MAX_VALUE);
		} catch (InterruptedException e) {
			System.out.println("["+Thread.currentThread().getName()+"] Interrupted by exception!");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread myThread = new Thread(new InterruptExample(), "myThread");
		myThread.start();

		System.out.println("["+Thread.currentThread().getName()+"] Sleeping in main thread for 5s...");
		Thread.sleep(5000);

		System.out.println("["+Thread.currentThread().getName()+"] Interrupting myThread");
		myThread.interrupt(); //comment to see that is not interrupted
		System.out.println("interrupted? " + myThread.isInterrupted());
	}
}
