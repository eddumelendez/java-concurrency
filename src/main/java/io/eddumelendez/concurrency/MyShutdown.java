package io.eddumelendez.concurrency;

/**
 * Created by eddumelendez on 6/19/15.
 */
public class MyShutdown {

	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("Shutting down");
			}
		});
		System.out.println("Starting process");
	}
}
