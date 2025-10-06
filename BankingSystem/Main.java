package BankingSystem;

public class Main {
    public static void main(String[] args) {
        Account current = new CurrentAccount("1234", 5000);
        Account savings = new SavingsAccount("2345", 10000);
        Account fixeddeposit = new FixedDeposit("3456", 20000);
        Customer c1 = new Customer("tarun", fixeddeposit);
        Customer c2 = new Customer("manoj", current);
        Customer c3 = new Customer("yashwanth", savings);
        c1.showAccountDetails();
        c2.showAccountDetails();
        c3.showAccountDetails();

    }

}
