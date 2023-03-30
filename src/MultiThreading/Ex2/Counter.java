package MultiThreading.Ex2;

class Counter {
    int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }
    public int getCount() {

        return count;
    }
}

