import java.util.*;

public class simplecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, sum, diff, product, quotient, remainder;
        int operation;

        System.out.println("Enter the first number: ");
        a = sc.nextFloat();

        System.out.println("Enter the second number: ");
        b = sc.nextFloat();

        System.out.println("Enter the operation you wanna perform: ");
        operation = sc.nextInt();

        switch (operation) {
            case 1: // Addition
                sum = a + b;
                System.out.println("Sum = " + sum);
                break;

            case 2: // Subtraction
                diff = a - b;
                System.out.println("Difference = " + diff);
                break;

            case 3: // Multiplication
                product = a * b;
                System.out.println("Product = " + product);
                break;

            case 4: // Division
                quotient = a / b;
                System.out.println("Quotient = " + quotient);
                break;

            case 5: // Remainder
                remainder = a % b;
                System.out.println("Remainder = " + remainder);
                break;

            default:
                System.out.println("Invalid Operator Entered!! Try Again");
                break;
        }
    }
}
