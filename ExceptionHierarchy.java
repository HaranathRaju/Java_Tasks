public class ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int res = num1 / num2;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("dividing by zero is not allowed");
        }
        try {
            String s = null;
            System.out.println(s.length());

        } catch (NullPointerException e) {
            System.out.println("null cannot be initialized");
        } finally {
            System.out.println("exception handling finished");
        }
    }

}
