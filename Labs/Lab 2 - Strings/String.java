package lab2;
import java.util.Scanner;

public class String {

    public static void main(String[] args) {
        String first="", second="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first String: ");
        first=sc.nextLine();
        System.out.print("Enter the second String: ");
        second=sc.nextLine();
        System.out.println("Entered strings are: "+ first +" , "+second);
        System.out.println("Length of the first string is :"+first.length());
        System.out.println("Length of the second string is :"+second.length());
        System.out.println("Concatenation of first and second string is :"+first.concat(" "+second));
        System.out.println("First character of " +first+" is: "+first.charAt(0));
        System.out.println("Uppercase of " +first+" is: "+first.toUpperCase());
        System.out.println("Lowercase of " +first+" is: "+first.toLowerCase());
        System.out.print("Occurance of a character in "+first+" : ");
        String str=sc.next();
        char c=str.charAt(0);
        System.out.println("The "+c+" occurs at position " + first.indexOf(c)+ " in " + first);
        System.out.print("Trimmed version of first string: "+first.trim());
        System.out.println();
        int result = first.compareTo(second);
        if(result>0)
                System.out.println(first + " is greater than " + second);
        else if(result<0)
                System.out.println(first + " is lesser than " + second);
        else
                System.out.println(first + " equals " + second);
        System.out.println("The substring of "+first+" starting from index 0 and ending at 5 is: " + first.substring(0,6));
        System.out.println("Replacing 'e' with 'k' in "+first+" is: "+first.replace('e','k'));       
        boolean check=first.equals(second);
        if(!check)
        System.out.println(first + " and " + second + " are not same.");
        else
        System.out.println(first + " and " + second + " are same."); 
    }

}