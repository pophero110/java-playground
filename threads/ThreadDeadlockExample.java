package threads;

public class ThreadDeadlockExample {
    public static void main(String[] args) {
        // Create two resources (locks)
        Object resource1 = new Object();
        Object resource2 = new Object();

        // Create and start Thread 1
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding resource 1...");

                try {
                    Thread.sleep(100); // Introduce a delay to increase the chances of deadlock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: Waiting for resource 2...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Acquired resource 2!");
                }
            }
        });

        // Create and start Thread 2
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding resource 2...");

                try {
                    Thread.sleep(100); // Introduce a delay to increase the chances of deadlock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: Waiting for resource 1...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Acquired resource 1!");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
