package threads;

public class ThreadRunnable implements Runnable {

    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadRunnable());
        thread.start();
    }
    
}
