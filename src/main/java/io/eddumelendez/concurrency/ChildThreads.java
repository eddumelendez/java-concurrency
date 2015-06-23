package io.eddumelendez.concurrency;

/**
 * Created by eddumelendez on 6/19/15.
 */
public class ChildThreads {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Sleeping for 5 seconds");
				try {
					Thread.sleep(5000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Finishing thread " + Thread.currentThread().getName());
			}
		}, "myThread");
		thread.start();
		thread.join(); // comment to see the difference
		System.out.println("Finishing thread " + Thread.currentThread().getName()
				+ " is alive? " + thread.isAlive());
	}

}
