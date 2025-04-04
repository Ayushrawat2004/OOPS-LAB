import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = 0;
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        }
        if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        }
        if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        }
        if (operator != '+' && operator != '-' && operator != '*') {
            System.out.println("Invalid operator! Please use +, -, or *.");
        }
        scanner.close();
    }
}


