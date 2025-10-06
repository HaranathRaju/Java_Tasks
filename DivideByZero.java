import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("enter the number: ");
            int num = sc.nextInt();
            int result = 100 / num;
            System.out.println("result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: divided by zero is not allowed");

        }
    }
}