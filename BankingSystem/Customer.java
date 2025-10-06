package BankingSystem;

class Customer {
    private String name;
    private Account account; 

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public void showAccountDetails() {
        System.out.println("Customer: " + name + ", Account Number: " + account.getAccno() + ", Balance: " + account.getBalance());
    }
}
