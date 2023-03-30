package MultiThreading.Ex2;

public class Main {
    public static void main(String[] args) {

        try {
            Counter count1 = new Counter();
            MultiThread arr[] = new MultiThread[100];
            for (int i = 0; i < 100; i++) {
                arr[i] = new MultiThread(count1);
                arr[i].start();
            }

        } catch (Exception ex) {
            System.out.println("Error"+ex);
        }



    }

}
