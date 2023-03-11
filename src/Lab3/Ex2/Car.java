package Lab3.Ex2;

public class Car {
    private Color color;
    private String name;
    private Double weight;

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void print() {
        System.out.println("Модель:  " + name + "\n"
                + "цвет: " + color + "\n"
                + "вес: " + weight + "тонн(ы)\n");
    }

}
