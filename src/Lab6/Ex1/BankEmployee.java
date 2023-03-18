package Lab6.Ex1;

public class BankEmployee extends Person {
    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Название банка: "+ bankName);
        System.out.println("Cотрудник банка: "+ getFirstName() + " " + getLastName());
        System.out.println("");

    }
}