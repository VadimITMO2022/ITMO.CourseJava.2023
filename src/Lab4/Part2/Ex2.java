package Lab4.Part2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length of array
        System.out.print("Array length: ");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];

        // input numbers of array
        System.out.println("Numbers of array: ");
        inputNumbers(arr);

    }

    //------------------------------------------------------------

    public static void inputNumbers(int[] arr) {
       // int[] arr = new int[arrayLength];
        Scanner scanner = new Scanner(System.in);
        for (int m = 0; m < arr.length; m++) {
            arr[m] = scanner.nextInt();
        }

        System.out.println("Result: " + Arrays.toString(arr));
    }


}
