package Lab4.Part1;

import java.util.Scanner;
public class Ex3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: " );
        int n1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int n2 = scan.nextInt();
        System.out.println("Введите третье число: ");
        int n3 = scan.nextInt();

        boolean n4;
        n4 =  (n1 + n2) == n3;

        System.out.println("Результат: " + n1+" + "+n2+ " = "+n3+" is  "+ n4);
    }


}
