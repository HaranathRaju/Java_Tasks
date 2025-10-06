package BankingSystem;

public class SavingsAccount extends Account {
    private final double interest=0.04;

    SavingsAccount(String accno, double balance) {
        super(accno,balance);
    }

    public void withdraw(double amount) {
        if (amount<=getBalance()) {
            setBalance(getBalance()-amount);
        } else {
            System.out.println("insufficient balance");
        }
    }
    public void calcInterest() {
        double interestrate=getBalance()*interest;
        setBalance(getBalance()+interestrate);
        System.out.println("newbalance : "+getBalance());
    }
}
