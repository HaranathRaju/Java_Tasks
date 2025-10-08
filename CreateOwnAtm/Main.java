package CreateOwnAtm;

public class Main {
    public static void main(String[] args) {
        UserAccount acc1 = new UserAccount(1234, 3456, 5000);
        UserAccount acc2 = new UserAccount(2345, 4567, 7000);
        UserAccount acc3 = new UserAccount(3456, 5678, 9000);
        UserAccount acc4 = new UserAccount(4567, 6789, 11000);
        UserAccount acc5 = new UserAccount(5678, 7890, 15000);
        Atm atm = new Atm(5);
        atm.addAccount(acc1);
        atm.addAccount(acc2);
        atm.addAccount(acc3);
        atm.addAccount(acc4);
        atm.addAccount(acc5);

        atm.deposit(acc3, 5678, 3000);
        atm.checkBalance(acc3);

        atm.withdraw(acc2, 4567, 2000);
        atm.checkBalance(acc2);

        atm.displayaccounts();
    }

}
