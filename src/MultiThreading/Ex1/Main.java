package MultiThreading.Ex1;

public class Main {
    public static void main(String[] args) {

        MultiThread arr[] = new MultiThread[10];
        for (int i = 0; i < 10; i++) {

            arr[i] = new MultiThread(i);
            arr[i].start();
        }
    }
}
