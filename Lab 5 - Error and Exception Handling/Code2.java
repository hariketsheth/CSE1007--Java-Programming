package lab5;
import java.util.*;

public class Lab5 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        String operation;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            num2 = input.nextInt();
        } catch (Exception e) {
            int[] numArray = new int[num1];
            for (int i = 0; i < numArray.length; i++) {
                System.out.println(numArray.toString() + " " + "can't be mathematically compared to " + num2 + " ");
            }
        }

        Scanner op = new Scanner(System.in);
        System.out.println("Enter operation (+,-,*,/): ");
        operation = op.next();
        if (operation.equals("+"))
            System.out.println("Result: " + (num1 + num2));
        if (operation.equals("-"))
            System.out.println("Result:  " + (num1 - num2));
        if (operation.equals("/"))
            System.out.println("Result: " + (num1 / num2));
        if (operation.equals("*"))
            System.out.println("Result: " + (num1 * num2));
    }
}
