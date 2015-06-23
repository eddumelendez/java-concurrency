package io.eddumelendez.concurrency;

/**
 * Created by eddumelendez on 6/19/15.
 */
public class DaemonThread {

	private static class MyDaemonThread extends Thread {
		public MyDaemonThread() {
			setDaemon(true);
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1);
					System.out.println("Executing after sleep");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Thread thread = new MyDaemonThread();
		thread.start();
	}

}
