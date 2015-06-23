package io.eddumelendez.concurrency;

/**
 * Created by eddumelendez on 6/22/15.
 */
public class StopThread extends Thread {

	private volatile Thread stopIndicator;

	public void start() {
		this.stopIndicator = new Thread(this);
		this.stopIndicator.start();
	}

	public void stopThread() {
		this.stopIndicator = null; //comment to see the difference
	}

	@Override
	public void run() {
		Thread thisThread = Thread.currentThread();
		while (thisThread == this.stopIndicator) {
			try {
				System.out.println("Thread is running");
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}

	public static void main(String[] args) {
		StopThread stopThread = new StopThread();
		stopThread.start();
		stopThread.stopThread();
	}
}
