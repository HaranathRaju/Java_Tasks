package BankSystem;

public class Account {
    private String accountno;
    private String ownername;
    private double balance;
    Account(String accountno,String ownername,double balance) {
        this.accountno=accountno;
        this.ownername=ownername;
        this.balance=balance;
    }
    public String getAccno() {
        return accountno;
    }
    public String getOwnername() {
        return ownername;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double amount) {
        balance+=amount;
    }

    public void displayinfo() {
        System.out.println("accno: "+accountno +" ownername: "+ownername+ " balance: "+balance);
    }

    public void deposit(double amount) {
        if (amount>0) {
            balance+=amount;
            System.out.println("amount added into account: "+amount);
            System.out.println("current balance after deposit: "+balance);
        } else {
            System.out.println("invalid amount");
        }
    }


    public void withdraw(double amount) {
        if (amount<=balance) {
            balance-=amount;
            System.out.println("amount withdraw from account: "+amount);
            System.out.println("current balance after withdraw : "+balance);
        } else {
            System.out.println("insufficient balance in your account ");
        }
    }

    public void transfer(Account toacc,double amount) {
       if (amount>0 && amount<=balance) {
        balance-=amount;
        toacc.balance+=amount;
        System.out.println("transfer to "+toacc.accountno+" balance: "+toacc.balance);
       } 
    }
}
