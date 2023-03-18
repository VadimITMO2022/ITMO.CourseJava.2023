package Lab6.Ex1;

public class Client extends Person {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Название банка: "+ bankName);
        System.out.println("Клиент банка: "+ getFirstName() + " " + getLastName());
        System.out.println("");
    }
}