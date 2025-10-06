import java.util.Scanner;

class NegativeNumberException extends RuntimeException {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

public class CustomUncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("enter the number: ");
            int num = sc.nextInt();
            if (num < 0) {
                throw new NegativeNumberException("negative numbers are not allowed");
            } else {
                System.out.println("valid number");
            }
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("program finished");
        }

    }

}
