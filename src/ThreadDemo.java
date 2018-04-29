class ChildThread extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " -> " + i);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws Exception {
		ChildThread ct = new ChildThread();
		// ct.setDaemon(true);
		ct.setName("Child");
		ct.start();

		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " -> " + i);
		}

		// System.out.println("Waiting!");
		// ct.join();
		// System.out.println("Done!");

	}

}
