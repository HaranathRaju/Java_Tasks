package CreateOwnAtm;

public class UserAccount {
    private int accno;
    private int pin;
    private double balance;
    UserAccount(int accno,int pin,double balance) {
        this.accno=accno;
        this.pin=pin;
        this.balance=balance;
    }
    public int getAccno() {
        return accno;
    }

    public int getPin() {
        return pin;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double amount) {
        this.balance=amount;
    }

    public String toString() {
        return "accno: "+accno +" balance: "+balance;
    }

}
