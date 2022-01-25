package lab2;
import java.util.Scanner;

public class Exercise {
    public static String changeCase(String input) {
    StringBuilder caps = new StringBuilder(input.length());
    boolean nextTitleCase = true;

    for (char c : input.toCharArray()) {
        if (Character.isSpaceChar(c)) {
            nextTitleCase = true;
        } else if (nextTitleCase) {
            c = Character.toTitleCase(c);
            nextTitleCase = false;
        }

        caps.append(c);
    }

    return caps.toString();
}

    public static void main(String[] args) {
        String first="", second="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first String: ");
        first=sc.nextLine();
        System.out.print("Enter the second String: ");
        second=sc.nextLine();
        System.out.println("Entered strings are: "+ first +" , "+second);
        System.out.println("Sum of lengths is :"+(first.length()+second.length()));
        System.out.println("The strings in Titlecase are: "+changeCase(first)+" "+changeCase(second));
    }
}