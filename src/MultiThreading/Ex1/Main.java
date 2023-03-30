package MultiThreading.Ex1;

public class Main implements Runnable {
    public static void main(String[] args) throws InterruptedException {

        int imax=10, jmax=101;
        Thread arr[] = new Thread[imax];

        for(int i=0; i<imax; i++) {
            arr[i] = new Thread();
            System.out.println("Current state of "+arr[i].getName()+" is " + arr[i].getState());
            arr[i].start();
            System.out.println("Current state of "+arr[i].getName()+" is " + arr[i].getState());
            for(int j =0; j<jmax; j++) {
                System.out.println(arr[i].getName()+" j="+j);
                Thread.sleep(1);}

            System.out.println("Current state of "+arr[i].getName()+" is " + arr[i].getState());
        }
        System.out.println();
    }

    @Override
    public void run() {
    }
}