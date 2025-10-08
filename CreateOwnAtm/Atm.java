package CreateOwnAtm;

public class Atm {

    UserAccount [] accounts;
    int count;

    Atm(int capacity) {
        accounts=new UserAccount[capacity];
        count=0;
    }

    public void addAccount(UserAccount a) {
        if (count<accounts.length) {
            accounts[count]=a;
            count++;
        } else {
            System.out.println("full...");
        }
    }

    public void checkBalance(UserAccount a) {
        if (a.getBalance()>0) {
            System.out.println("balance for  "+a.getAccno() +" is  : "+a.getBalance());
        }
    }

    public void deposit (UserAccount a,int pin,double amount) {
        if (a.getPin()==pin && a.getBalance() >0) {
            double balance=a.getBalance()+amount;
            a.setBalance(balance);
            System.out.println("balance after depsoit: "+a.getBalance());
        } else {
            System.out.println("enter the valid pin");
        }

    }
    public void withdraw(UserAccount a,int pin,double amount) {
        if (a.getPin()==pin && amount<=a.getBalance()) {
            double balance =a.getBalance()-amount;
            a.setBalance(balance);
            System.out.println("balance after withdraw: "+a.getBalance());
        } else {
            System.out.println("enter the valid pin");
        }
    }

    public void displayaccounts() {
        for (UserAccount a: accounts) {
            System.out.println(a);
        }
    }
    
}
