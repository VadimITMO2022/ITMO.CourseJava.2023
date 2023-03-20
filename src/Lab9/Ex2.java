package Lab9;

//import java.util.HashSet;
import java.util.*;
//import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {

        // коллекция автомобилей
        ArrayList<String> cars = new ArrayList<>
                (Arrays.asList("Honda", "Honda", "Toyota", "Toyota", "Toyota", "Ford"));
        cars.add("Subaru");
        cars.add("Chevrolet");
        cars.add("Volvo");
        cars.add("Chevrolet");
        cars.add("Ford");
        cars.add("Toyota");
        System.out.println(cars);

        // коллекция автомобилей без дубликатов
        Set cars1=getHashSetList(cars);
        System.out.println(cars1);
    }
    public static Set getHashSetList(List list) {

        return new HashSet<String>(list);
    }
}
