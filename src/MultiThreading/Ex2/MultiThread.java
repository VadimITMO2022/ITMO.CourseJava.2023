package MultiThreading.Ex2;

class MultiThread extends Thread {
    int sum ;
    Counter count1;
    MultiThread(Counter count1) {

        this.count1 = count1;
    }
    public int getSum() {

        return sum;
    }

    public void run() {
        sum2();
    }

    private void sum2() {
            for (int i = 0; i < 1000; i++) {
                count1.increment();
                int sum = count1.getCount();

                System.out.println("I'm " + Thread.currentThread().getName() + "  i = " + i + "  Sum = " + sum);
        }

    }

}