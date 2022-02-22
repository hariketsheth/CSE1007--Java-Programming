package Lab5;
import java.util.*;

public class Lab5 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        int result;
        num1 = input.nextInt();
        num2 = input.nextInt();

        try {
            result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero.");
        }

    }
}