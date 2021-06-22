package pqueue;
/**
 * @author g_chockler
 *
 */
import java.util.Date;
import java.util.Scanner;

public class TaskScheduler<T> implements Runnable {
	
	private boolean stop = false;

	private class Event implements Comparable<Event> {
		long deadline;
		long remind;
		T task;

		@Override
		public int compareTo(Event o) {
			if (this.deadline != o.deadline) return this.deadline < o.deadline ? 1 : -1;
			return 0;
		}
		
		public String toString() {
			return new Date(deadline) + ": " + "|" + task + "|";
		}
	}

	private MaxPriorityQueue<Event> mpq = new MaxPriorityQueue<Event>(100);

	public void schedule(long deadline, long remind, T what) {
		Event e = new Event();
		e.deadline = deadline - remind;
		e.remind = remind;
		e.task = what;
		System.out.println("Scheduled |" + e.task + "| remind at " + new Date(e.deadline));
		synchronized(this) {
			mpq.insert(e);
			notifyAll();
		}
	}

	@Override
	public void run() {
		System.out.println("Started...");
		synchronized(this) {
			while(true) {
				try {
					if (!mpq.isEmpty()) {
						Event e = mpq.getMax();
						long delay = e.deadline - System.currentTimeMillis();
						if (delay <= 0) {
							System.out.println(new Date(System.currentTimeMillis()) + 
									": Reminder: |" + e.task + "| is due in " + (e.remind/1000.0) + " sec");
							mpq.deleteMax();
						}
						else  {
							wait(delay);
						}
					}
					else {
						if (!stop)
							wait();
						else
							break;
					}
				} catch (InterruptedException e) {}
			}
		}
	}
	
	public synchronized void stop() {
		stop = true;
		notifyAll();
	}
	
	public static void main(String[] args) throws InterruptedException {
		TaskScheduler<String> ts = new TaskScheduler<String>();
		new Thread(ts).start();
		long now = System.currentTimeMillis();
		ts.schedule(now + 10000, 2000, "COM1029 homework");
		ts.schedule(now + 20000, 5000, "Watch TV");
		ts.schedule(now + 5000, 1000, "Meet with friends");
		ts.schedule(now + 7000, 1000, "Finish coursework");
//		Scanner scanner = new Scanner(System.in);
//		while (true) {
//			System.out.print("Enter task: ");
//			String task = scanner.nextLine();
//			System.out.print("Enter deadline (seconds from now): ");
//			long delta = Integer.parseInt(scanner.nextLine());
//			System.out.print("Remind before deadline (seconds): ");
//			long rem = Integer.parseInt(scanner.nextLine());
//			ts.schedule(System.currentTimeMillis() + delta * 1000, rem * 1000, task);
//			System.out.print("Schedule next event? (y/n): ");
//			String ans = scanner.nextLine();
//			if (ans.toLowerCase().startsWith("n")) {
//				System.out.println("Bye");
//				break;
//			}
//		}
//		scanner.close();
		ts.stop();
	}
}
