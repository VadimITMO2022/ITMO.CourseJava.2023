package Lab4.Part1;

public class Ex6 {

    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 4, 7, 4, 2};

        // print array
        printArray(arr);

// check condition and print result
        System.out.println(checkArray(arr));
    }

    //------------------------------------------------------------
    public static void printArray(int[] arr) {

        String mass = " ";

        for (int m = 0; m < arr.length; m++) {
            mass += Integer.toString(arr[m]) + "  ";
        }
        System.out.println("array: " + mass);

    }

    //------------------------------------------------------------

    public static boolean checkArray(int[] arr) {
        boolean b = false;

        for (int m = 0; m < arr.length; m++) {
            if (arr[m] == 1 || arr[m] == 3) {
                b = true;
                break;
            }
        }

        return b;
    }


}
