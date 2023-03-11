package Lab4.Part1;

public class Ex5 {

    public static void main(String[] args) {
        int[] arr = {3, -3, 7, 4, 5, 4, 3};

        String mass = " ";

        for (int m = 0; m < arr.length; m++) {
            mass+=Integer.toString(arr[m])+"  ";
            }

            System.out.println("array: "+ mass);

        boolean b = false;


        if (arr.length >= 2 && arr[0] == 3 && arr[arr.length - 1] == 3) {
            b= true;
        }

        System.out.println(b);


    }

    private static boolean checkArray(int[] arr) {
        if (arr.length < 2) {
            return false;
        }

        if (arr[0] == 3 || arr[arr.length - 1] == 3) {
            return true;
        }

        return false;
    }

    private static void printArray(int[] arr) {
        String line = "array = ";

        for (int i = 0; i < arr.length; i++) {
            line += arr[i];
            if (i != (arr.length - 1)) {
                line += ", ";
            }
        }

        System.out.println(line);
    }
}
