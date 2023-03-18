package Lab6.Ex2;


public class Client implements Person {
    private String firstName;
    private String lastName;
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankName = bankName;
    }


    public String getFirstName() {

        return firstName;
    }


    public String getLastName() {

        return firstName;
    }


    public void printInfo() {
        System.out.println(firstName + " " + lastName + " является клиентом " + bankName);
    }
}

