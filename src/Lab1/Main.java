package Lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //-- 1 --------------------------------

        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");


        //-- 2 --------------------------------

        double a1 = (46.d + 10.d) * (10.d / 3.d);
        System.out.println(a1);

        //-- 3 --------------------------------

        double a2 = 29.d * 4.d * (-15.d);
        System.out.println(a2);

        //-- 4 --------------------------------

        int number = 10500;
        double result = ((double) number) / 10.d / 10.d;
        System.out.println(result);


        //-- 5 -----------------------------------

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 1-е целое число 42:");
        int x1 = scan.nextInt();
        System.out.println("Введите 2-е целое число 100:");
        int x2 = scan.nextInt();
        System.out.println("Введите 3-е целое число 125:");
        int x3 = scan.nextInt();
        System.out.println("Вы ввели 3 числа:");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println();



        //-- 6 -----------------------------------

        System.out.println("Введите целое число:");
        int b = scan.nextInt();

        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else {
            if (b > 100) {
                System.out.println("Выход за пределы диапазона");
            } else {
                System.out.println("Четное");
            }
        }

    }

}
