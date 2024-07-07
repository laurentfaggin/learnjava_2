package Threads;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		/*	Thread =		A thread of execution in a program (kind of like a virtual CPU)
		 * 					The JVM allows an application to have multiple threads running concurrently
		 * 					Each thread can execute parts of your code in parallel with the main thread
		 * 					Each thread has a priority.
		 * 					Threads with higher priority are executed in preference compared to the thread with a lower priority
		 * 
		 * 					The Java Virtual Machine continues to execute threads until either of the following occurs:
		 * 						1. the exit method of the class Runtime has been called
		 * 						2. All user threads have died.
		 * 
		 * 					When a JVM starts up, there is a thread which calls the main method
		 * 					This thread is called "main"
		 * 					
		 * 					(Daemon est un thread qui tourne en background sans avoir besoin d'une interaction utilisateur)
		 * 					Daemon thread is a low priority thread that runs in background to perform tasks such as a garbage collection
		 * 					JVM terminates itself when all user threads (non-daemon threads) finish
		 */
		
		//System.out.println(Thread.activeCount());
		
		//Thread.currentThread().setName("mon main");
		//System.out.println(Thread.currentThread().getName());
		
		//System.out.println(Thread.currentThread().getPriority());
		
		//Thread.currentThread().setPriority(10);
		//System.out.println(Thread.currentThread().getPriority());
		//System.out.println(Thread.currentThread().isAlive());
		
		/*
		for (int i = 3; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		System.out.println("You are done!");
		*/
		
		MyThread thread2 = new MyThread();
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon());
		//thread2.run();
		thread2.start();
		//System.out.println(thread2.isAlive());
		
		//thread2.setName("2nd thread");
		//System.out.println(thread2.getName());
		
		//thread2.setPriority(1);
		//System.out.println(thread2.getPriority());
		
		System.out.println(Thread.activeCount());

	}

}
