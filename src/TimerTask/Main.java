package TimerTask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		//	Timer =			A facility for threads to schedule tasks
		//					for future execution in a background thread
		
		//	TimerTask = 	A task that can be scheduled for one-time
		//					or repeated execution by a timer
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter = 10;
			@Override
			public void run() {
				//System.out.println("Task is complete  :)");
				if (counter == 10) {
					System.out.println(counter + " seconds");
					counter --;
				}
				else if (counter > 0 && counter < 10) {
					System.out.println("0" + counter + " seconds");
					counter --;
				}
				else {
					System.out.println("Happy New Year !");
					timer.cancel();
				}
			}			
		};
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2024);
		date.set(Calendar.MONTH, Calendar.JULY);
		date.set(Calendar.DAY_OF_MONTH, 7);
		date.set(Calendar.HOUR_OF_DAY, 11);
		date.set(Calendar.MINUTE, 10);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		
		//	Task effectuee apres un delai parametre (ici trois secondes)
		//timer.schedule(task, 3000);
		
		//	Task effectuee a la date parametree avec l'entite date de Calendar
		//timer.schedule(task, date.getTime());
		
		//	Task effectuee periodiquement (ici pas de delai avant l'execution de la tache, puis execution toutes les secondes)
		//timer.scheduleAtFixedRate(task, 0, 1000);		
		
		// Ou a une date specifique
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);		


	}

}
