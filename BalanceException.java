class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

class Bank {
    private double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Withdraw extends Bank {
    Withdraw(double balance) {
        super(balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > getBalance()) {
            throw new InsufficientFundsException("balance must be greater than withdraw amount");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("balance: " + getBalance());

        }
    }
}

public class BalanceException {
    public static void main(String[] args) {
        Withdraw wd = new Withdraw(10000);
        try {
            wd.withdraw(12000);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("remaining balance : " + wd.getBalance());
        }
    }

}
