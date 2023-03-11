package Lab2.Ex2;

public class Main {

    public static void main(String[] args) {

        Teacher IvanPetrov = new Teacher(1026,
                "Иван Петров",
                JobTitle.Профессор,
                Faculty.Физический,
                "д.ф.-м.н.",
                56000,
                1968,
                true);

        Teacher MariaSidorova = new Teacher(1045,
                "Мария Сидорова",
                JobTitle.Доцент,
                Faculty.Химический,
                "к.ф.-м.н.",
                37000,
                1977,
                false);


        //  Car mercedesWhite = new Car("Mercedes", "S-Class", Color.WHITE, 600000, 170, true);

        System.out.println(IvanPetrov.toString());
        System.out.println(IvanPetrov.getInfoSalary(10));
        System.out.println("\n");
        System.out.println(MariaSidorova.toString());
        System.out.println(MariaSidorova.getInfoSalary(20));


    }
}
