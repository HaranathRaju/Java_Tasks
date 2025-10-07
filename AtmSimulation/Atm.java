package AtmSimulation;


public class Atm {
    private Bank bank;

    public Atm(Bank bank) {
        this.bank = bank;
    }
    public void start() {
        System.out.println("Welcome to ATM");
        String accno = "A1001";
        int pin = 1234;
        UserAccount user = bank.authentication(accno, pin);
        if (user == null) {
            System.out.println("Invalid Account Number or PIN!");
            return;
        }
        System.out.println("Login successful for Account: " + accno);

        System.out.println("Balance: " + user.getbalance());
        if (user.withdraw(2000)) {
            System.out.println("Withdrawal successful! New Balance: " + user.getbalance());
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}


