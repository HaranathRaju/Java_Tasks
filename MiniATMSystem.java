
import java.util.Scanner;

class User {
    private int pin;
    private double balance;

    public User(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class ATM {
    private User[] users;
    private int userCount;

    public ATM(int capacity) {
        users = new User[capacity];
        userCount = 0;
    }

    public void addUser(User u) {
        if (userCount < users.length) {
            users[userCount++] = u;
        }
    }

    private int validatePIN(int pin) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getPin() == pin) {
                return i;
            }
        }
        return -1;
    }

    public void startATM() {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        System.out.println("===== Welcome to Mini ATM =====");

        while (attempts < 3) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = sc.nextInt();

            int userIndex = validatePIN(enteredPin);
            if (userIndex != -1) {
                System.out.println("Login Successful ✅");
                operate(users[userIndex]);
                return;
            } else {
                attempts++;
                System.out.println("Invalid PIN ❌ (" + attempts + "/3 attempts)");
            }
        }

        System.out.println("Too many failed attempts! Card blocked ❌");
        sc.close();
    }

    private void operate(User user) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Balance: ₹" + user.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        user.setBalance(user.getBalance() + deposit);
                        System.out.println("Deposited ₹" + deposit + ". New Balance: ₹" + user.getBalance());
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= user.getBalance()) {
                        user.setBalance(user.getBalance() - withdraw);
                        System.out.println("Withdrew ₹" + withdraw + ". New Balance: ₹" + user.getBalance());
                    } else {
                        System.out.println("Insufficient balance or invalid amount!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
    }
}

public class MiniATMSystem {
    public static void main(String[] args) {
        ATM atm = new ATM(5);
        atm.addUser(new User(1111, 5000));
        atm.addUser(new User(2222, 10000));
        atm.addUser(new User(3333, 7500));
        atm.addUser(new User(4444, 12000));
        atm.addUser(new User(5555, 9000));
        atm.startATM();
    }
}