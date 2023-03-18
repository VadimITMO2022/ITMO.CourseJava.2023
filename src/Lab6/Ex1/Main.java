package Lab6.Ex1;

public class Main {

    public static void main(String[] args) {
       Client client = new Client("Николай", "Иванов", "Альфа-Банк");
       BankEmployee employee = new BankEmployee("Мария", "Петрова", "Банк Санкт-Петербург");

        client.printInfo();
        employee.printInfo();
    }
}