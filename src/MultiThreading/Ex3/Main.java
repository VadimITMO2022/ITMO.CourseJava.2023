package MultiThreading.Ex3;

public class Main {
    public static void main(String[] args)
    {
        // Make an instance of TwoThreads class
        TwoThreads obj = new TwoThreads();

        // Thread t1 will call firstThread()
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    obj.firstThread();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // Thread t2 will call secondThread()
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    obj.secondThread();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // Start t2 and then t1
        t2.start();
        t1.start();
    }
}
