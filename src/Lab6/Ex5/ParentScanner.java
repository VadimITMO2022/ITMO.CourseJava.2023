package Lab6.Ex5;

import java.util.Scanner;

public class ParentScanner {
    Scanner scanner = new Scanner(System.in);

    public Scanner getScanner() {
        return scanner;
    }

    public void getInformation() {
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        System.out.println("Возраст " + age);
    }

}