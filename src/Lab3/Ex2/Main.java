package Lab3.Ex2;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car(Color.GRAY,3.5);
        honda.setName("Honda Accord");
        honda.print();

        Car toyota = new Car(Color.WHITE, 2.3);
        toyota.setName("Toyota Corolla");
        toyota.print();
    }

}
