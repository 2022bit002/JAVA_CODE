import java.util.Scanner;

class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number to be divided : ");
            int num = scanner.nextInt();
            System.out.println("Enter a number that is divisor :");
            int n = scanner.nextInt();
            int result = num / n ;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero or invalid input.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

