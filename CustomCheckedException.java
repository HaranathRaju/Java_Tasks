import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class CustomCheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter the age: ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("age must be above 18");
            } else {
                System.out.println("age is valid");
            }

        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("program finished");
        }
    }
}