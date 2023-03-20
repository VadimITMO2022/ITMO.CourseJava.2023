package Lab9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();

        int numberAdd = 1000000;
        int numberGet = 100000;
        int maxValue =10;


        System.out.println("ArrayList");
        addNumbers(arrayList, numberAdd, maxValue);
        getNumbers(arrayList, numberGet, numberAdd);
        System.out.println();

        System.out.println("LinkedList");
        addNumbers(linkedList, numberAdd, maxValue);
        getNumbers(linkedList, numberGet, numberAdd);
    }

    //----------------------------------------------------------------------------------
    public static void addNumbers(List list, Integer numberAdd, Integer maxValue) {
        long t0, t1, delta;
        Random random = new Random();
        t0 = System.currentTimeMillis();
        for (int i = 0; i < numberAdd; i++) {
            double l = random.nextInt(maxValue);
            list.add(l);
        }
        t1 = System.currentTimeMillis();
        delta=t1-t0;

        System.out.println("Добавлены " + numberAdd + " элементов. Время: "
                + delta + " мс");
    }

    // ---------------------------------------------------------------------------------

    public static void getNumbers(List list, Integer numberGet, Integer numberAdd) {
        long t0, t1, delta;
        Random random = new Random();
        t0 = System.currentTimeMillis();
        for (int i = 0; i < numberGet; i++) {
            int l = random.nextInt(numberAdd);
            list.get(l);
        }
        t1 = System.currentTimeMillis();
        delta=t1-t0;

        System.out.println("Выбраны " + numberGet + " элементов. Время: "
                + delta + " мс");
    }
}
