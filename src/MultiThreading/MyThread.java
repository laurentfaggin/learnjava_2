package MultiThreading;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("Thread #1 : " + i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			// we create an exception to see what happen
			//System.out.println(1/0);
		}
		System.out.println("Thread #1 is finished!");
	}

}
