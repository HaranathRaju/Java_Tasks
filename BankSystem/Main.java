package BankSystem;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account("56823", "tarun", 5000);
        Account a2 = new Account("67892", "dheeraj", 10000);
        Account a3 = new Account("79024", "manoj", 12000);
        a1.deposit(2000);
        a2.withdraw(3000);
        a3.transfer(a1, 5000);
        Bank b = new Bank(10);
        b.addAccount(a1);
        b.addAccount(a2);
        b.addAccount(a3);
        b.displayAccounts();
    }

}
