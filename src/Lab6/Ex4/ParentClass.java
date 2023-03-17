package Lab6.Ex4;

import java.util.Scanner;

public class ParentClass {
    private Integer intNumber;

    public ParentClass() {
        System.out.println("Введите любое целое число: ");
        Scanner scanner = new Scanner(System.in);
        intNumber = scanner.nextInt();
    }

    public Integer getNumber() {
        return intNumber;
    }
}