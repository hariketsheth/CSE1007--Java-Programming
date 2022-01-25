package lab2;
import java.util.Scanner;

public class NumtoWord {

    public static void main(String[] args) {
        int digit, num, temp;
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();
        temp = num;
        while (temp > 0) {
            digit = temp % 10;
            switch (digit){
                case 0:
                    result = "Zero " + result;
                    break;
                case 1:
                    result = "One " + result;
                    break;
                case 2:
                    result = "Two " + result;
                    break;
                case 3:
                    result = "Three " + result;
                    break;
                case 4:
                    result = "Four " + result;
                    break;
                case 5:
                    result = "Five " + result;
                    break;
                case 6:
                    result = "Six " + result;
                    break;
                case 7:
                    result = "Seven " + result;
                    break;
                case 8:
                    result = "Eight " + result;
                    break;
                case 9:
                    result = "Nine " + result;
                    break;
            }
            temp /= 10;
        }
        System.out.println("Original Number: " + num);
        System.out.println("Word Format: " + result);
                
    }

}