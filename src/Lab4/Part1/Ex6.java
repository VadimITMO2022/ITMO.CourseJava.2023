package Lab4.Part1;

public class Ex6 {

    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 4, 7, 4, 2};

        String mass = " ";

        for (int m = 0; m < arr.length; m++) {
            mass+=Integer.toString(arr[m])+"  ";
        }

        System.out.println("array: "+ mass);

        boolean b = false;

        for (int m = 0; m < arr.length; m++) {
            if (arr[m] == 1 || arr[m] == 3) {
                b = true; break;
            }


        }
        System.out.println(b);
    }

}
