package Lab6.Ex2;

public class BankEmployee implements Person {
    private String firstName;
    private String lastName;
    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankName = bankName;
    }

    public String getFirstName() {

        return firstName;
    }


    public String getLastName() {

        return lastName;
    }

    public void printInfo() {
        System.out.println(getFirstName() + " " + getLastName() + " работает в " + bankName);
    }
}
