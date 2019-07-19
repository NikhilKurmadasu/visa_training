package threads;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers t1=new Numbers(1,400);
		Numbers  t2=new Numbers(900,5200);
		Chars ch=new Chars();
		Thread t3=new Thread(ch);
		t3.start();
		t1.start();
		t2.setDaemon(true);
		t2.start();
		doTask();
		
	}

	private static void doTask() {
		Thread t = Thread.currentThread();
		System.out.println("Name : " + t.getName());
		System.out.println("Priority : " + t.getPriority());
		System.out.println("Group : " + t.getThreadGroup().getName());
		/*
		 * JRE waits for the status of last NonDaemon Thread
		 */
		System.out.println("Daemon : " + t.isDaemon());
	}
}
