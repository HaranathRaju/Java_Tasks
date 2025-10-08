package BankSystem;

public class Bank {
    Account [] accounts;
    int count;
    Bank (int capacity) {
        accounts=new Account[capacity];
        count=0;
    }

    public void addAccount(Account a) {
        if (count<accounts.length) {
            accounts[count]=a;
            count++;
        } else {
            System.out.println("accounts are full");
        }
    }

    public void findAccount(String accno) {
        for (int i=0;i<accounts.length;i++) {
            if (accounts[i].getAccno().equals(accno ) && accounts[i]!=null) {
                System.out.println("balance is : "+accounts[i].getBalance());

            }
        }

    }
    public void displayAccounts() {
        for (Account a: accounts) {
            if(a!=null) {
                a.displayinfo();
            }
            
        }
    }
}
