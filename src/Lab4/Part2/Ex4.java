package Lab4.Part2;

import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {
        int[] arr = {10, 6, 10, 5, 10, 6, 4};
        System.out.println(Arrays.toString(arr));

        int a1 = 0;
        int a2 = 0;
        int a3;
        for (int i = 0; i < arr.length; i++) {
            a1++;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    a2++;
                    break;
                }
            }
        }
        a3 = a1 - a2;

        System.out.println(a1+" "+a2);
        System.out.println("Уникальное число в массиве: "+a3);
    }
}
