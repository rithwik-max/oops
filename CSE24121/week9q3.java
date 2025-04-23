
import java.util.Scanner;
public class week9q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter num1 numbers: ");
            System.out.println("Enter num2 numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            } finally {
            scanner.close();
            System.out.println("Scanner closed.");
            System.out.println("Program finished.");
            }
    }
}
