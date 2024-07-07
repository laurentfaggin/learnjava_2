package MultiThreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// Multithreading =		Process of executing multiple threads simultaneously
		//						Helps maximum utilization of CPU
		//						Threads are independent, they don't affect the execution of other threads.
		//						An exception in one thread will not interrupt other threads
		//	

		// Create a subclass of Thread
		
		MyThread thread1 = new MyThread();
		
		// or
		
		MyRunnable runnable1 = new MyRunnable();
		
		Thread thread2 = new Thread(runnable1);
		
		// thread1.setDaemon(true);  // ici le thread s'execute en background, donc on ne voit pas le resultat
		// thread2.setDaemon(true);  // donc la JVM se stoppera car il n'y a pas de user thread qui run
		
		thread1.start();
		// Pour executer un thread entierement avant que les autres ne commencent leur execution
		//thread1.join(3000); //calling thread (ex.main) waits until the specified thread dies or for x milliseconds
		thread2.start();

		// we create an exception to see what happen
		// System.out.println(1/0);
	}

}
