package lab8;
import java.io.*;
import java.util.*;

class PAN {
    String number;
    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the PAN Number: ");
        number = sc.nextLine();
    }
    void display(LinkedList < PAN > ll, int n) {
        for (int i = 0; i < n; i++)
            System.out.println("PAN Number: " + ll.get(i).number);

    }
    LinkedList < PAN > reverse(LinkedList < PAN > ll, int n) {
        LinkedList < PAN > rev = new LinkedList < PAN > ();
        for (int i = n - 1; i >= 0; i--)
            rev.add(ll.get(i));
        return rev;
    }
}
public class Lab8 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of PAN Records: ");
        n = sc.nextInt();
        PAN p1[] = new PAN[n];
        LinkedList < PAN > arr = new LinkedList < PAN > ();
        LinkedList < PAN > rev = new LinkedList < PAN > ();
        for (int i = 0; i < n; i++) {
            p1[i] = new PAN();
            p1[i].get();
            arr.add(p1[i]);
        }
        System.out.println("Printing the Original Linked List: \n");
        p1[0].display(arr, n);
        rev = p1[0].reverse(arr, n);
        System.out.println("\nPrinting the Second Linked List: \n");
        p1[0].display(rev, n);
    }
}