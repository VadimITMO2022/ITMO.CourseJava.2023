package MultiThreading.Ex1;

class MultiThread extends Thread {
    int num;
    MultiThread(int num) {
        this.num = num;
    }

    public void run() {
        int i, sum = 0, imax = 100;
        System.out.println(Thread.currentThread().getName() + " started. Состояние потока: "
                + Thread.currentThread().getState());
        for (i = 0; i < imax; i++)
            // if(i==0)
            System.out.println("I'm " + Thread.currentThread().getName() + "   " + i + " Cостояние потока: "
                    + Thread.currentThread().getState());
        if (i == imax) System.out.println(Thread.currentThread().getName() + " finished. Состояние потока: "
                + Thread.currentThread().getState());
    }
}
