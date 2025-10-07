package AtmSimulation;

public class Main {
    public static void main(String[] args) {
        UserAccount[] accs = {
            new UserAccount("A1001", 1234, 5000),
            new UserAccount("A1002", 4321, 10000),
            new UserAccount("A1003", 1111, 7500)
        };
        Bank bank = new Bank(accs);
        Atm atm = new Atm(bank);
        atm.start();
    }
}