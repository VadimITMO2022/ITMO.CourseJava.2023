package MultiThreading.Ex3;

class TwoThreads {


    static boolean run = true;

    public void firstThread() throws InterruptedException {

        while (true) {
            synchronized (this) {
                while (!run) {
                    wait();
                }
                System.out.println("I am thread  "+Thread.currentThread().getName());
                run = false;
                notify();
            }
        }
    }

    public void secondThread() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (run) {
                    wait();
                }
                System.out.println("I am thread  "+Thread.currentThread().getName());
                run = true;
                notify();
            }
        }
    }
}