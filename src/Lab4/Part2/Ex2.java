package Lab4.Part2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array length: ");
        int arrayLength = scanner.nextInt();

        System.out.println("Numbers of array:");
        int[] arr = new int[arrayLength];
        for (int m = 0; m < arrayLength; m++) {
            arr[m] = scanner.nextInt();
        }

        System.out.println("Result: " + Arrays.toString(arr));
    }
}
