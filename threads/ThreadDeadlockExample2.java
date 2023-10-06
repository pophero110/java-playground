package threads;

public class ThreadDeadlockExample2 {
    private final String name;

    public ThreadDeadlockExample2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void call(ThreadDeadlockExample2 example) {
        System.out.println(this.getName() + " has asked to call me " + example.getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        example.callMe(this);
    }

    public synchronized void callMe(ThreadDeadlockExample2 example) {
        System.out.println(this.getName() + " has called me " + example.getName());
    }

    public static void main(String[] args) {
        var example1 = new ThreadDeadlockExample2("caller-1");
        var example2 = new ThreadDeadlockExample2("caller-2");

        new Thread(() -> {
            example1.call(example2);
        }).start();
        new Thread(() -> {
            example2.call(example1);
        }).start();
    }
}
