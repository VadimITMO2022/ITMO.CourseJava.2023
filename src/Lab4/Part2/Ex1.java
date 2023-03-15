package Lab4.Part2;

public class Ex1 {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1,  3, 4,6,9,6};

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

    public static String checkArray(int[] arr) {
        String b = "Ok";

        for (int m = 1; m < arr.length; m++) {
            if (arr[m] < arr[m - 1]) {
                b = "Please, try again";
            }
        }

        return b;
    }

}

