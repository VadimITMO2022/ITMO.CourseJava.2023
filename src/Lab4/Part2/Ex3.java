package Lab4.Part2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        int[] arr = {-5, 3, 9, 7, 4};

        System.out.println(Arrays.toString(arr));

        changeNumbers(arr);
        System.out.println(Arrays.toString(arr));

    }

//----------------------------------------------------
    public static void changeNumbers(int[] arr) {
        int a1 = arr[0];
        int a2 = arr[arr.length - 1];
        arr[0] = a2;
        arr[arr.length - 1] = a1;
    }



}
