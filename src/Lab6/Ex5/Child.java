package Lab6.Ex5;

public class Child extends ParentScanner {
    @Override
    public void getInformation() {
        System.out.println("Введите имя");
        String name = getScanner().nextLine();
        System.out.println("Имя " + name);
    }

}