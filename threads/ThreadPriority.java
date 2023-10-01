package threads;

public class ThreadPriority extends Thread {
    public void run() {
       System.out.println("running thread priority is: " + Thread.currentThread().getPriority()); 
    }

    public static void main(String[] args) {
        ThreadPriority m1 = new ThreadPriority();
        ThreadPriority m2 = new ThreadPriority();
        m1.setPriority(MAX_PRIORITY);
        m2.setPriority(MIN_PRIORITY);
        m1.start();
        m2.start();
    }
}
