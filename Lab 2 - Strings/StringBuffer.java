package lab2;
import java.util.Scanner;

public class StringBuffer {

    public static void main(String[] args) {
        StringBuffer first = new StringBuffer("HariketSukeshKumar");
        StringBuffer second = new StringBuffer("Sheth");
        Scanner sc=new Scanner(System.in);
        System.out.println("Entered strings are: "+ first +" , "+second);
        System.out.println("Length of the first string is :"+first.length());
        System.out.println("Length of the second string is :"+second.length());
        System.out.println("First character of " +first+" is: "+first.charAt(0));
        System.out.println();
        int result = first.compareTo(second);
        if(result>0)
                System.out.println(first + " is greater than " + second);
        else if(result<0)
                System.out.println(first + " is lesser than " + second);
        else
                System.out.println(first + " equals " + second);
        System.out.println("The substring of "+first+" starting from index 0 and ending at 5 is: " + first.substring(0,6));  
        boolean check=first.equals(second);
        System.out.println(first.append(" NEW STRING"));
        System.out.println(first.insert(2, " NEW STRING"));
        System.out.println(first.delete(2,8));
        System.out.println(second.reverse());
        System.out.println(second.indexOf("S"));
        
        if(!check)
        System.out.println(first + " and " + second + " are not same.");
        else
        System.out.println(first + " and " + second + " are same."); 
    }

}