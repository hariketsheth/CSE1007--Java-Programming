package lab5;
import java.util.*;

public class Lab5 {
    public static int[] getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
        }
        return array;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = getArray();
        System.out.print("Enter the index to display: ");
        try {
            System.out.println("Element: " + array[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception Caught: Index Out of Bound");
        }
    }
}