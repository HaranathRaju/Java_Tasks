package AtmSimulation;

public class Bank {
    UserAccount [] accounts;
    Bank (UserAccount[] accounts) {
        this.accounts=accounts;
    }

    public UserAccount authentication(String accno,int pin) {
        for (int i=0;i<accounts.length;i++) {
            if (accounts[i]!=null && accounts[i].getaccno().equals(accno) && accounts[i].getpin()==pin) {
                return accounts[i];
            }
        }
        return null;

    }
    
}
