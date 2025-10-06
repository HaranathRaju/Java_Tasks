package BankingSystem;

public abstract class Account {
    private String accno;
    private double balance;

    Account(String accno,double balance) {
        this.accno=accno;
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }
    public String getAccno() {
        return accno;
    }
    public void setBalance(double balance) {
        this.balance=balance;

    }

    public abstract void withdraw(double amount);
    public abstract void calcInterest();
   
}
