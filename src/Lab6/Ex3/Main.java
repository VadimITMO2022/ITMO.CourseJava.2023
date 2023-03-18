package Lab6.Ex3;

public class Main {
    public static void main(String[] args) {
        Truck volvo = new Truck(7500, "Volvo FL", 'w', 120.f, 8, 15000);
        int newAmountWheels =16;

        volvo.OutPutTruck();
        volvo.NewWheels(newAmountWheels);
    }
}
