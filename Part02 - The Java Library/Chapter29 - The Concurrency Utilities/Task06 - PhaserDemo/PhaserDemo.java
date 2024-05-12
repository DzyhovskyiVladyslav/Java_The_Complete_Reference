import java.util.concurrent.*;

class PhaserDemo {
	public static void main(String[] args) {
		Phaser phsr = new Phaser(1);
		int curPhase;
		System.out.println("Starting");
		new Thread(new MyThread(phsr, "A")).start();
		new Thread(new MyThread(phsr, "B")).start();
		new Thread(new MyThread(phsr, "C")).start();
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");
		curPhase = phsr.getPhase();
		phsr.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " Complete");
		phsr.arriveAndDeregister();
		if(phsr.isTerminated())
			System.out.println("The Phaser is terminated");
	}
}

class MyThread implements Runnable {
	Phaser phsr;
	String name;
	
	MyThread(Phaser p, String n) {
		phsr = p;
		name = n;
		phsr.register();
	}
	
	public void run() {
		System.out.println("Thread " + name + " Beginning Phase One");
		phsr.arriveAndAwaitAdvance(); 
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Thread " + name + " Beginning Phase Two");
		phsr.arriveAndAwaitAdvance();
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Thread " + name + " Beginning Phase Three");
		phsr.arriveAndDeregister();
	}
}