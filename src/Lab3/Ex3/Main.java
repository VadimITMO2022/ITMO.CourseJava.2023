package Lab3.Ex3;

public class Main {

    public static void main(String[] args) {
        House administrativeBuilding = new House();
        administrativeBuilding.setData(5, 1965, "Административное здание");
        administrativeBuilding.printData();
        administrativeBuilding.printAge();

        House apartmentBuilding = new House();
        apartmentBuilding.setData(23, 2011, "Многоквартирный жилой дом");
        apartmentBuilding.printData();
        apartmentBuilding.printAge();
    }

}
