package Lab3.Ex3;

import java.time.LocalDate;

public class House {

    private Integer numberFloors;
    private Integer yearBuilding;
    private String nameBuilding;

    public void setData(Integer numberFloors, Integer yearBuilding, String nameBuilding) {
        this.numberFloors = numberFloors;
        this.yearBuilding = yearBuilding;
        this.nameBuilding = nameBuilding;
    }

    public void printData() {
        System.out.println("тип дома: " + nameBuilding + "\n"
                + "число этажей: " + numberFloors+ "\n"
                + "год постройки: " + yearBuilding + "\n"
        );
    }


    public void printAge() {
        Integer ageHouse = LocalDate.now().getYear() - yearBuilding;
        System.out.println("возраст дома: " + ageHouse + "  лет/года/год"+"\n");
    }

}
