package Lab4.Part1;

public class Ex2 {

    public static void main(String[] args) {

        String rat3 = " ";
        String rat5 = " ";
        String rat3and5 = " ";
        //= "Делится на 3:";
       // String rat5 = "Делится на 5:";
        //String rat3and5 = "Делится на 3 и 5:";

        for (int m = 1; m < 100; m++) {
            if (m % 3 == 0) {
                rat3 += " " + m;
            }

            if (m % 5 == 0) {
                rat5 += " " + m;
            }

            if (m % 3 == 0 && m % 5 == 0) {
                rat3and5 += " " + m;
            }
        }

        System.out.println("Делится на 3:"+rat3);
        System.out.println("Делится на 3:"+rat5);
        System.out.println("Делится на 3 и 5:"+rat3and5);
    }
}
