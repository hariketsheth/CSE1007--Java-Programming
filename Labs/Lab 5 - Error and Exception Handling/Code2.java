package lab5;
import java.util.*;

public class Lab5 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        int operation;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            num2 = input.nextInt();
            System.out.print("Enter operation (1(+) 2(-) 3(*) 4(/): ");
            operation = input.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result:  " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 / num2));
                    break;
                case 4:
                    System.out.println("Result: " + (num1 * num2));
                    break;
            }
        } catch (Exception e) {
            System.out.println("Exception Caught: Please give correct input");
        }

    }
}