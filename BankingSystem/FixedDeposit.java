package BankingSystem;

public class FixedDeposit extends Account {
    private final double interest=0.07;
    FixedDeposit(String accno,double balance) {
        super(accno,balance);
    }
    public void withdraw(double amount) {
        if (getBalance()>=amount) {
            setBalance(getBalance()-amount);

        } else {
            System.out.println("insufficient balance");
        }
    }
    public void calcInterest() {
        double interestrate=getBalance()*interest;
        setBalance(interestrate+getBalance());
        System.out.println("new balance : "+getBalance());
    }
}