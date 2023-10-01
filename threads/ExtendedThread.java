package threads;

public class ExtendedThread extends Thread {
    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        Thread thread = new ExtendedThread();
        thread.start();
    }
}
