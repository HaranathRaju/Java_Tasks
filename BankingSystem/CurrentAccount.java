package BankingSystem;

public class CurrentAccount extends Account {
    private final double limit=5000;
    CurrentAccount(String accno,double balance) {
        super(accno,balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount<=getBalance()+limit) {
            setBalance(getBalance()-amount);
            System.out.println("withdraw amount: "+amount+" newnbalance: "+getBalance());
        }else {
            System.out.println("exceeded limit in current account");
        }
    }

    @Override
    public void calcInterest() {
        System.out.println("current account does not earn interest");
    }
}
