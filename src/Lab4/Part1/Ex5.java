package Lab4.Part1;


public class Ex5 {

    public static void main(String[] args) {
        int[] arr = {3, -3, 7, 4, 5, 4, 3};

        // print array
        printArray(arr);
// check condition
        checkArray(arr);

// print result
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

        if (arr.length >= 2 && arr[0] == 3 && arr[arr.length - 1] == 3) {
            b = true;
        }

        return b;
    }


}
