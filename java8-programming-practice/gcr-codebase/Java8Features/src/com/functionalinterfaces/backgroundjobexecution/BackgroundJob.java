package com.functionalinterfaces.backgroundjobexecution;

public class BackgroundJob {

	public static void main(String[] args) {

		// Runnable task using lambda
		Runnable job = () -> {
			System.out.println("Background job started");

			try {
				Thread.sleep(2000); // simulate long task
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Background job completed");
		};

		// run task asynchronously
		Thread thread = new Thread(job);
		thread.start();

		System.out.println("Main thread continues execution");
	}
}
