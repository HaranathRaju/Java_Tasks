package AtmSimulation;

public class UserAccount {
    private String accno;
    private double balance;
    private int pin;
    

    public UserAccount(String accno, double balance, int pin) {
        this.accno = accno;
        this.balance = balance;
        this.pin = pin;
    }
    String getaccno() {
        return accno;
    }
    int getpin() {
        return pin;
    }
    double getbalance() {
        return balance;
    }

    public  boolean withdraw(int amount) {
        if (amount<=balance) {
            balance-=amount;
            return true;
        } else {
            return false;
        }
    }
     
}
