package lab5;
import java.util.*;

public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        while (true) {
            System.out.print("Enter 2 integers: ");
            try {
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("You must enter 2 integers! \n");
                sc.nextLine();
            }
        }
        System.out.println("Sum: " + (num1 + num2));
    }
}