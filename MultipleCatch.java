import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("enter the number1: ");
            int num1 = sc.nextInt();
            System.out.print("enter the number2: ");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println("result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: dividing by zero is not allowed");

        } catch (InputMismatchException e) {
            System.out.println("Error: please enter valid integer numbers only");
        } finally {
            System.out.println("program finished");
        }

    }

}
