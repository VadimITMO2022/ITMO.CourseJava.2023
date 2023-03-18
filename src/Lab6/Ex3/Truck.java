package Lab6.Ex3;

public class Truck extends Car {
    private Integer amountWheels;
    private Integer maximalWeight;

    public Truck(int weight, String model, char color, float speed,
                 Integer amountWheels, Integer maximalWeight) {

        super(weight, model, color, speed);
        this.amountWheels = amountWheels;
        this.maximalWeight = maximalWeight;
    }

    public void OutPutTruck() {
        super.outPut();
        System.out.println("Количество колес: " + amountWheels);
        System.out.println("Максимальный вес: " + maximalWeight + "кг");
    }

    public void NewWheels(int newAmountWheels) {
         int NewAmountWheels = newAmountWheels;
         System.out.println("Новое количество колес: " + NewAmountWheels);
    }



}
