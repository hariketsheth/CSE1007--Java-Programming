package lab5;
import java.util.*;

public class Lab5 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        int result;
        System.out.print("Enter the Number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter the Number 2: ");
        num2 = input.nextInt();

        try {
            result = num1 / num2;
            System.out.println("The result of the Operation: "+result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero.");
        }

    }
}